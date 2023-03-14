package com.example.demo.fConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResource implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/audio/**")
                .addResourceLocations("file:D://onlineMusic//audio//");
        registry.addResourceHandler("/image/**")
                .addResourceLocations("file:D://onlineMusic//image//");
        registry.addResourceHandler("/User_Avatar/**")
                .addResourceLocations("file:D://onlineMusic//User_Avatar//");
    }
}

