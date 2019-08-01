package com.qianfeng.springboothello.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author Liy
 * @Date 2019/7/29
 */
@Component
@ConfigurationProperties(prefix = "resource")
public class Resource {

//    @Value("${resource.imageServer}")
    private String imageServer;

//    @Value("${resource.emailServer}")
    private String emailServer;

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }
}
