package com.wen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value ="/cars")
    public Car addCar(@RequestParam("name") String name,
                         @RequestParam("speed") Integer speed) {
        Car car = new Car();
        car.setName(name);
        car.setSpeed(speed);
        carRepo.save(car);
        return car;
    }

    @GetMapping(value = "cars/{id}")
    Car findOneCar(@PathVariable("id") Integer id) {
        return carRepo.findOne(id);
    }

    @PutMapping(value = "cars/{id}")
    Car updateCar(@PathVariable("id") Integer id,
                              @RequestParam("name") String name,
                              @RequestParam("speed") Integer speed) {
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        car.setSpeed(speed);
        return carRepo.save(car);
    }

    @DeleteMapping(value = "cars/{id}")
    void deleteCar(@PathVariable("id") Integer id) {
        carRepo.delete(id);
    }

}
