package com.lujieni.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther ljn
 * @Date 2019/12/24
 */
@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/hello")
    public void hello(){
        log.debug("http-2-8080-exec-nio-bb-qq");
    }

}
