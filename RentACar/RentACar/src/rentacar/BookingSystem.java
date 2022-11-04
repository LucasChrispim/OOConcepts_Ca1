/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.io.BufferedReader;
import java.io.IOException;
import ooc.yoursolution.BookingSystemInterface;
import ooc.yoursolution.BookingSystemInterface;
import ooc.yoursolution.Car;
import ooc.yoursolution.CarInterface;
import ooc.yoursolution.RentACarInterface;

/**
 *
 * @author gusta
 */
public class BookingSystem implements BookingSystemInterface {

    public BookingSystem() {
    }

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        String title = in.readLine();
        String content = "";
        
        CarInterface car= new Car();
        
        for(int n = 1; n<= 5; n++){
            String content = in.readLine();
            String[] line = content.split(":");
            String make = [0];
            String rate1 = line[1];
            int rate2 = parseInt(rate1);
        }
        return null;
      }
    
}
