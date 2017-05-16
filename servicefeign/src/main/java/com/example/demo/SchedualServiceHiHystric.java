package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by jay on 2017-5-15.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
