package com.ishan.stuManagement;

/**
 * Created by Ishan on 7/3/2017.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {
    @RequestMapping("/rentmaster/greeting")
    public String sayHello(){
        return "<h1> wow springboot you are awsome !!! </h1>";
    }

}
