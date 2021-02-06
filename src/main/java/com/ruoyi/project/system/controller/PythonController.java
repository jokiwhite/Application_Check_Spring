package com.ruoyi.project.system.controller;


import com.ruoyi.common.utils.R;
import com.ruoyi.framework.web.controller.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Api(tags = "爬虫程序启动")
@RestController
@RequestMapping("/system/python")
public class PythonController extends BaseController{

    @PostMapping("/start/{pythonName}/{pythonPassword}")
    public R start(@PathVariable("pythonName") String name,@PathVariable("pythonPassword") String password) throws IOException, InterruptedException {

        Process proc = Runtime.getRuntime().exec("python D://p.py");

        BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line = null;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
        proc.waitFor();

        return R.ok().data("1",name);
    }

}
