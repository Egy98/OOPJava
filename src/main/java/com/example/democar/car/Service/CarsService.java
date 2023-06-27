package com.example.democar.car.Service;

import com.example.democar.car.Cars;

import java.util.List;
import java.util.Optional;


public interface CarsService {

    Cars createCars(Cars cars);

    Cars updateCars(Cars cars);

    void deleteCars(Long id);

    List<Cars> getAllCars();

    Cars getCars(Long id);

/*    List<Cars> findByVendor(String vendor);


    Optional<Object> findById(Long id);

    void save(Cars cars);*/
}
