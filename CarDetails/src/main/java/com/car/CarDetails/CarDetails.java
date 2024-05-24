package com.car.CarDetails;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="carsinfo")
public class CarDetails {
    @Id
private int carid;
private String carName;
private String carModel;
private String carYear;
public CarDetails() {
}
public CarDetails(int carid, String carName, String carModel, String carYear) {
    this.carid = carid;
    this.carName = carName;
    this.carModel = carModel;
    this.carYear = carYear;
}
public int getCarid() {
    return carid;
}
public void setCarid(int carid) {
    this.carid = carid;
}
public String getCarName() {
    return carName;
}
public void setCarName(String carName) {
    this.carName = carName;
}
public String getCarModel() {
    return carModel;
}
public void setCarModel(String carModel) {
    this.carModel = carModel;
}
public String getCarYear() {
    return carYear;
}
public void setCarYear(String carYear) {
    this.carYear = carYear;
}
}

