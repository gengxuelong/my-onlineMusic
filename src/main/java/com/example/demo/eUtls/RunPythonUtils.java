package com.example.demo.eUtls;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName RunPythonUtils
 * @verson 1.0
 * @Description:
 */
@Component
public class RunPythonUtils {
    public void startPy(String location) {
        try {
            Process process = Runtime.getRuntime().exec("python " + location);
            process.waitFor(6, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
