package com.multi.datasource.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wgc
 */
@RestController
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "hello, world";
    }

}