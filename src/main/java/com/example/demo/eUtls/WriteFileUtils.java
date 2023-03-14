package com.example.demo.eUtls;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName WriteFileUtils
 * @verson 1.0
 * @Description:
 */
@Component
public class WriteFileUtils {
    public void write(String value) {
        String directory = "D://onlineMusic/";
        String fileName = "test.txt";
        File file = new File(directory);
        if (!file.exists()) {
            file.mkdir();
        }
        File file1 = new File(directory + fileName);
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file1);
            fileOutputStream.write(value.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileOutputStream != null;
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
