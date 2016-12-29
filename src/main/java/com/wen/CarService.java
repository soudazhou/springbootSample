package com.wen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Wenxuan on 29/12/2016.
 */
@Service
public class CarService {

    @Autowired
    CarRepo carRepo;

    @Transactional
    public void addTwoCars() {
        Car car1 = new Car();
        car1.setName("FORD");
        car1.setSpeed(5);
        carRepo.save(car1);

        Car car2 = new Car();
        car2.setName("FIATTTTTTTTTTTTTT");
        car2.setSpeed(3);
        carRepo.save(car2);
    }
}
