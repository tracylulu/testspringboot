package com.xdclass.springboot.xdclass;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.ReentrantLock;

@RestController
public class TestController {

    public static final String s = "1";

    @RequestMapping("hello")
    public String hello() {
        User u = new User();
        u.setName("1");
        u.setAge(1);
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
    String d="\n";

        return "hello";
    }
}
