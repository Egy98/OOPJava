package com.example.democar.car;

import com.example.democar.car.Service.CarsService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class CarsController {

    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public List<Cars> getAllCars() {
        return carsService.getAllCars();
    }

    @GetMapping("/cars{id}")
    public Cars getCars(@PathVariable Long id){
        return carsService.getCars(id);
    }

    @PostMapping("/cars")
    public Cars createCars(@RequestBody Cars cars) {
        return carsService.createCars(cars);
    }

    @PutMapping("/cars{id}")
    public Cars updateCars(@PathVariable Long id, @RequestBody Cars cars) {
        if (!id.equals(cars.getId())) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "L'id nel percorso non corrisponde all'id dell'oggetto animale");
        }
        return carsService.updateCars(cars);
    }

    @DeleteMapping("/cars{id}")
    public void deleteCars(@PathVariable Long id) {
        carsService.deleteCars(id);
    }

/*    @GetMapping("/cars{id}/Vendor")
    public List<Cars> getCarsByVendor(@RequestParam String Vendor) {
        return carsService.findByVendor(Vendor);
    }

    @PostMapping("/{id}/fuel-level")
    public void setFuelLevel(@PathVariable Long id, @RequestParam int FuelLevel) throws ChangeSetPersister.NotFoundException {
        Cars cars = (Cars) carsService.findById(id)
                .orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        cars.getFuelLevel();
        carsService.save(cars);
    }*/

}
