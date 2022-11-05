/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;


import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Gustavo,Lucas
 */
public class RentACar implements RentACarInterface{

    String name;
    List<CarInterface> cars;
    
    @Override
    public List<CarInterface> getCars() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.cars = cars;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        return false;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        
        for(CarInterface cars : cars){
            
        }        
        
        return 3;
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        return true;
    }

    @Override
    public int getNumberOfCars() {
        int total = 0;
        for(CarInterface car : cars){
            
            total+=car.getNumber();
        }
        return total ;
    }
    
}
