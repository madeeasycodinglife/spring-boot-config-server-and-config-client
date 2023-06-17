package com.madeeasy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
/**
 *  To use @RefreshScope, yoy have use ::
 *  POST http://localhost:8080/actuator/refresh
 *  here the port should be config-client
 */
@RefreshScope
public class DepartmentController {
    @Value("${message: Hello default}")
    private String message;

    @GetMapping("/message")
    String getMessage() {
        return this.message;
    }
}
