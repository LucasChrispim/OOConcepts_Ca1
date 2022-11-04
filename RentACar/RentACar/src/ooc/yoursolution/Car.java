/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.ArrayList;
import ooc.enums.Month;

/**
 *
 * @author lucas,gusta
 */
public class Car {
    int id;
    double rate;
    String make;
    ArrayList<Month> calendarAvailability;

    public Car(int id, double rate, String make, ArrayList<Month> calendarAvailability) {
        this.id = id;
        this.rate = rate;
        this.make = make;
        this.calendarAvailability = calendarAvailability;
    }

    public Car() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * return the id of the car
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * set the id of the car
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * return the rate
     * @return 
     */
    public double getRate() {
        return rate;
    }
    /**
     * set the rate
     * @param rate 
     */
    public void setRate(double rate) {
        this.rate = rate;
    }
    /**
     * return make
     * @return 
     */
    public String getMake() {
        return make;
    }
    /**
     * set make
     * @param make 
     */
    public void setMake(String make) {
        this.make = make;
    }
    /**
     * return array list
     * @return 
     */
    public ArrayList<Month> getCalendarAvailability() {
        return calendarAvailability;
    }
    /**
     * 
     * @param calendarAvailability 
     */
    public void setCalendarAvailability(ArrayList<Month> calendarAvailability) {
        this.calendarAvailability = calendarAvailability;
    }
    
    
}
