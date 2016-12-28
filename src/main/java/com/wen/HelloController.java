package com.wen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wenxuan on 28/12/2016.
 */
@RestController
public class HelloController {

    @Autowired
    private Car car;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String speak() {
        return "Car name: "+car.getName()+"  Car Speed: "+car.getSpeed();
    }
}
