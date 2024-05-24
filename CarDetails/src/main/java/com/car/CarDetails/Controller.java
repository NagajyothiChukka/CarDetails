package com.car.CarDetails;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class Controller {

    @Autowired
    private CarService carService;

    // Get all cars
    @GetMapping
    public List<CarDetails> getCarDetails() {
        return carService.getCarsDetails();
    }

    // Get car by ID
    @GetMapping("/{carId}")
    public CarDetails getCarDetails(@PathVariable int carId) {
        return carService.getCarDetails(carId);
    }

    // Add a new car
    @PostMapping
    public CarDetails addCarDetails(@RequestBody CarDetails carDetails) {
        return carService.addCarDetails(carDetails);
    }

    // Update an existing car
    @PutMapping("/{carId}")
    public CarDetails updateCarDetails(@PathVariable int carId, @RequestBody CarDetails carDetails) {
        carDetails.setCarid(carId);
        return carService.updateCarDetails(carDetails);
    }

    // Delete a car by ID
    @DeleteMapping("/{carId}")
    public void deleteCarDetails(@PathVariable int carId) {
        carService.deleteCarDetails(carId);
    }
}
