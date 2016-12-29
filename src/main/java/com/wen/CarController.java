package com.wen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Wenxuan on 29/12/2016.
 */
@RestController
public class CarController {

    @Autowired
    CarRepo carRepo;

    @GetMapping(value = "/allCars")
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }


}
