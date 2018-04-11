package com.example.demo;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import sun.security.provider.MD5;

/**
 * Created by jay on 2017-5-15.
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @Value("${foo}")
    private String value;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return "client hi " + value + "     " + schedualServiceHi.sayHiFromClientOne(name);
    }
}

