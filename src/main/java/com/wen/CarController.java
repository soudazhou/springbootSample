package com.wen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping(value ="/Cars")
    public Car addCar(@RequestParam("name") String name,
                         @RequestParam("speed") Integer speed) {
        Car car = new Car();
        car.setName(name);
        car.setSpeed(speed);
        carRepo.save(car);
        return car;
    }


}
