package com.wen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Wenxuan on 28/12/2016.
 */
@RestController
public class HelloController {

    @Autowired
    private CarProperties car;

    //@RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
    @GetMapping(value = {"/hello","/hi"})
    public String speak(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "ID: "+myId+" Car name: "+car.getName()+"  Car Speed: "+car.getSpeed();
    }
}
