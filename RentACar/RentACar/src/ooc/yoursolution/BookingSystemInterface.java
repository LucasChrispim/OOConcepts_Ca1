/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import ooc.enums.Make;

/**
 * @author Gustavo,Lucas
 */
public class BookingSystem implements BookingSystemInterface{
        
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException{
        
        Scanner text = new Scanner(in);
        
        RentACarInterface carsToRent = new RentACar();
        List<CarInterface> cars = new ArrayList<CarInterface>();
        
        
        String title = in.readLine();
        carsToRent.setName(title);
        String content = "";
        
        int counter = 0;
        while(in.ready()){
            //System.out.println(title);
            content = in.readLine();
            //System.out.println(content);
               
            String[] parts = content.split(":");
            
            int id = counter + 1;
            String rateString =  parts[1];
            int intRate = parseInt(rateString);   //convert rateString to int
            double rate = intRate;                  //convert Rate to double
            Make make = Make.valueOf(parts[0]);
            int number = parseInt(parts[2]);
            Car car = new Car(id, rate, make, number);
            cars.add(car);
            counter++;
            content = title;
            //System.out.println(Arrays.toString(parts));
        }
        carsToRent.setCars(cars);
        return carsToRent;
        
    }

}
