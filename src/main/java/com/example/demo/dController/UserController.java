package com.example.demo.dController;

import com.example.demo.aEntity.User;
import com.example.demo.cService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/login")
    public Object login(User u) {
        return service.login(u);
    }

    @PostMapping("/updateUser")
    public Integer updateUser(User u) {
        return service.updateUser(u);
    }

    @PostMapping("/fileUpload")
    public Object fileUpload(MultipartFile file, String Uid, String fileName) {
        return service.upLoadFile(file, Uid, fileName);
    }

    @PostMapping("/register")
    public String register(User u) {
        System.out.println(u);
        return service.register(u);
    }
}
