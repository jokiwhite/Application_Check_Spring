package com.ruoyi.common.utils;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;

public class FTPUtil {

    /**
     * 打开FTP服务链接
     * @param ftpHost
     * @param ftpPort
     * @param ftpUserName
     * @param ftpPassword
     */
    public static FTPClient getFTPClient(String ftpHost, Integer ftpPort, String ftpUserName, String ftpPassword){
        FTPClient ftpClient = null;
        try {
            ftpClient = new FTPClient();
            ftpClient.setConnectTimeout(60000);
            if(ftpPort != null){
                ftpClient.connect(ftpHost, ftpPort);// 连接FTP服务器
            }else {
                ftpClient.connect(ftpHost);// 连接FTP服务器
            }
            if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
                if (ftpClient.login(ftpUserName, ftpPassword)) {// 登陆FTP服务器
                    if (FTPReply.isPositiveCompletion(ftpClient.sendCommand(
                            "OPTS UTF8", "ON"))) {// 开启服务器对UTF-8的支持，如果服务器支持就用UTF-8编码，否则就使用本地编码（GBK）.
                        ftpClient.setControlEncoding("UTF-8");
                    }else {
                        ftpClient.setControlEncoding("GBK");
                    }
                    ftpClient.enterLocalPassiveMode();// 设置被动模式
                    ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);// 设置传输的模式，以二进制流的方式读取
                    ftpClient.enterLocalPassiveMode();
                    System.out.println("FTP服务连接成功！");
                }else {
                    System.out.println("FTP服务用户名或密码错误！");
                    disConnection(ftpClient);
                }
            }else {
                System.out.println("连接到FTP服务失败！");
                disConnection(ftpClient);
            }
        } catch (SocketException e) {
            e.printStackTrace();
            disConnection(ftpClient);
            System.out.println("FTP的IP地址可能错误，请正确配置。");
        } catch (IOException e) {
            e.printStackTrace();
            disConnection(ftpClient);
            System.out.println("FTP的端口错误,请正确配置。");
        }
        return ftpClient;
    }

    /**
     * 关闭FTP服务链接
     * @throws IOException
     */
    public static void disConnection(FTPClient ftpClient){
        try {
            if(ftpClient.isConnected()){
                ftpClient.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取文件夹下的所有文件信息
     * @param path 文件路径
     */
    public static FTPFile[] getFTPDirectoryFiles(FTPClient ftpClient,String path){
        FTPFile[] files = null;
        try {
            ftpClient.changeWorkingDirectory(path);
            files = ftpClient.listFiles();
        }catch (Exception e){
            e.printStackTrace();
            //关闭连接
            disConnection(ftpClient);
            System.out.println("FTP读取数据异常！");
        }
        return files;
    }


    /**
     * 获取文件夹下的所有文件信息
     * @param path 文件路径
     */
    public static InputStream getFTPFile(FTPClient ftpClient,String path,String fileName){
        InputStream in = null;
        try {
            ftpClient.changeWorkingDirectory(path);
            FTPFile[] files = ftpClient.listFiles();
            if(files.length > 0){
                in  = ftpClient.retrieveFileStream(fileName);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("FTP读取数据异常！");
        }finally {
            //关闭连接
            disConnection(ftpClient);
        }
        return in;
    }

    public static void main(String args[]) throws IOException {
//        URL url = new URL("http://localhost:8080/profile/upload/2021_14.pdf");
//        URLConnection connection = url.openConnection();
//
//        InputStream is = connection.getInputStream();
//        upload("name2.pdf",is);
        String fileName = "/profile/upload/2021_14.pdf";
        String[] names = fileName.split("/");
        System.out.println(names[3]);

    }



    public static String getData(String path, String fileName) {
        InputStream in = null;
        BufferedReader br = null;
        try{
            FTPClient ftpClient = getFTPClient("10.16.8.224",21,"test","test");//实验室服务器
            //读取单个文件
            in = getFTPFile(ftpClient,path,fileName);
            if(in != null){
                br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
                String data = null;
                data = br.readLine();
                return data;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                //关闭流
                if (br != null)
                    br.close();
                if (in != null)
                    in.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return "null";
    }

    public static boolean upload(String fileName,String url1) throws IOException {
        URL url = new URL(url1);
        URLConnection connection = url.openConnection();
        InputStream input = connection.getInputStream();
//        FTPClient ftpClient = getFTPClient("169.254.234.164",21,"test","test");//本地
        FTPClient ftpClient = getFTPClient("10.16.8.224",21,"test","test");//实验室服务器
        String ftpPath = "currentPDF/";
        try {
            // 切换到上传目录
            if (!ftpClient.changeWorkingDirectory(ftpPath)) {
                // 如果目录不存在创建目录
                String[] dirs = ftpPath.split("/");
                String tempPath = "";
                for (String dir : dirs) {
                    if (null == dir || "".equals(dir)) {
                        continue;
                    }

                    tempPath += "/" + dir;
                    if (!ftpClient.changeWorkingDirectory(tempPath)) {
                        ftpClient.makeDirectory(tempPath);
                        ftpClient.changeWorkingDirectory(tempPath);
                    }
                }
            }
            System.out.println(ftpPath);

            String[] names = fileName.split("/");

            fileName=new String(names[3].getBytes("GBK"),"iso-8859-1");
            // 上传文件
            boolean b=ftpClient.storeFile(fileName, input);

            return b;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ftpClient != null) {
                try {
                    ftpClient.logout();
                    ftpClient.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}