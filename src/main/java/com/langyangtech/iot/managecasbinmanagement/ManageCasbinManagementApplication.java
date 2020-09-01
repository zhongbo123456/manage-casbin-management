package com.langyangtech.iot.managecasbinmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ManageCasbinManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageCasbinManagementApplication.class, args);
    }

}
