/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import ooc.enums.Make;

/**
 *
 * @author gusta
 */
public class RentACar {
    Car car;
    String name;
    int NumberOfCars;

    public int getNumberOfCars() {
        return NumberOfCars;
    }

    public void setNumberOfCars(int NumberOfCars) {
        this.NumberOfCars = NumberOfCars;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void checkAvailability(String month, int day,Make make, int lenghtOfRent ){
        return;
    }
    public void getCarAvailable(String month, int day,Make make, int lenghtOfRent ){
        int id = this.car.getId();
        return;
    }

}
