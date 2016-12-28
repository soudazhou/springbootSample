package com.wen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Wenxuan on 28/12/2016.
 */
@RestController
public class HelloController {

    @Autowired
    private Car car;

    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
    public String speak(@RequestParam("id") Integer myId) {
        return "ID: "+myId+" Car name: "+car.getName()+"  Car Speed: "+car.getSpeed();
    }
}
