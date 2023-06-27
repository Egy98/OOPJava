package com.example.democar.car.Service;

import com.example.democar.car.Cars;
import com.example.democar.car.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarsServiceImp implements CarsService{

    private final CarsRepository carsRepository;

    public CarsServiceImp(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public Cars createCars(Cars cars) {
        return carsRepository.save(cars);
    }

    @Override
    public Cars updateCars(Cars cars) {
        return carsRepository.save(cars);
    }

    @Override
    public void deleteCars(Long id) {
        carsRepository.deleteById(id);
    }

    @Override
    public List<Cars> getAllCars() {
        return carsRepository.findAll();
    }

    @Override
    public Cars getCars(Long id) {
        return carsRepository.findById(id).orElseThrow();
    }

/*    @Override
    public List<Cars> findByVendor(String vendor) {
        return null;
    }*/

}
