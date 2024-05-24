package com.car.CarDetails;




import java.util.List;

public interface CarService {

    List<CarDetails> getCarsDetails();

    CarDetails getCarDetails(int carId);

    CarDetails addCarDetails(CarDetails carDetails);

    CarDetails updateCarDetails(CarDetails carDetails);

    CarDetails deleteCarDetails(int carId);
}


