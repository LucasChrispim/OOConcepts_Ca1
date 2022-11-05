
package rentacar;


import ooc.yoursolution.BookingSystem;

import ooc.yoursolution.BookingSystemInterface;
import ooc.yoursolution.RentACarInterface;
import ooc.enums.Make;
import ooc.enums.Month;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//https://github.com/LucasChrispim/OOConcepts_Ca1


//Gustavo Silvino Lambert 2021278
//Lucas Barros Chrispim 2020301 


public class Driver {

    /**
     * Do not change the signature of the main method!
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BookingSystemInterface bookingSystem = new BookingSystem();//OK

        String file = "car_rentals.txt"; //OK
        BufferedReader in = new BufferedReader(new FileReader(file));//OK

        RentACarInterface rentACar = bookingSystem.setupRentACar(in);//OK

        
        System.out.println(rentACar);
        
        // Get the name of the car rental
        System.out.println(rentACar.getName());//OK
        
        // Print the number of cars in the rent-a-car
        System.out.println("We have a total of: " + rentACar.getNumberOfCars() + " Cars");  //OK
        
        // Check if there is a BMW car available for 5 days from the 1st
        // of January
        System.out.println(rentACar.checkAvailability(Month.JANUARY, 1, Make.BMW, 5)); 
        
        // Get the id of the car available
        System.out.println(rentACar.getCarAvailable(Month.JANUARY, 1, Make.BMW, 5));
        
        // Try some bookings
        System.out.println(rentACar.bookCar(Month.JANUARY, 1, Make.BMW, 5));
        System.out.println(rentACar.bookCar(Month.JANUARY, 1, Make.BMW, 5));
        System.out.println(rentACar.bookCar(Month.JANUARY, 1, Make.BMW, 5));
        System.out.println(rentACar.bookCar(Month.JANUARY, 1, Make.BMW, 5));
        System.out.println(rentACar.bookCar(Month.FEBRUARY, 3, Make.FIAT, 10));
        System.out.println(rentACar.bookCar(Month.MARCH, 10, Make.FORD, 12));
        
    }

}
