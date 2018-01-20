package io.javabrains.springbootquickstart.courseapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(path = "/hello")
    public String hello(){
        return "Hi Abir";
    }
}
