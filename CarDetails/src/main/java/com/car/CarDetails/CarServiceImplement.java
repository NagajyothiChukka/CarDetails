package com.car.CarDetails;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImplement implements CarService {

     Repo carDetailsRepository;

    @Autowired
    

    @Override
    public List<CarDetails> getCarsDetails() {
        return carDetailsRepository.findAll();
    }

    public CarServiceImplement(Repo carDetailsRepository) {
        this.carDetailsRepository = carDetailsRepository;
    }

    @Override
    public CarDetails getCarDetails(int carId) {
        return carDetailsRepository.findById(carId).orElse(null);
    }

    @Override
    public CarDetails addCarDetails(CarDetails carDetails) {
        return carDetailsRepository.save(carDetails);
    }

    @Override
    public CarDetails updateCarDetails(CarDetails carDetails) {
        return carDetailsRepository.save(carDetails);
    }

    @Override
    public CarDetails deleteCarDetails(int carId) {
        CarDetails carDetails = getCarDetails(carId);
        if (carDetails != null) {
            carDetailsRepository.deleteById(carId);
        }
        return carDetails;
    }

    
}
