/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben Rivera
 */
public class Car {

    private String carMake, carModel, carVin;
    private double price;
    private int carYear, mileage;

    public Car(String carMake, String carModel, int carYear, String carVin, double price, int mileage) {
   this.carMake = carMake;
   this.carModel = carModel;
   this.carYear = carYear;
   this.carVin = carVin;
   this.price = price;
   this.mileage = mileage;
    
    }

    public String getCarMake() {
        return this.carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarVin() {
        return this.carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }
public int getCarYear(){
    return this.carYear;
}
    public void setCarYear(int carYear) {
        if (carYear < 1970) {
            System.out.println("Please enter a year higher than 1970");
        }else{
            this.carYear = carYear;
        }
    }
    public int getMileage(){
        return this.mileage;
    }
    public void setMileage(int mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        }else{
           System.out.println("Mileage needs to be higher than 0"); 
        }

    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price) {
        if (price >= 1000) {
            this.price = price;
        } else {
            System.out.println("Price needs to be higher than $1000");
            
        }
    }
    
   @Override
   public String toString(){
       return "Make: " + carMake + "\n" + "Model: "+ carModel + "\n" + "Year: " + carYear + "\n" + "VIN: " + carVin+ "\n" + "Price: $" + price + "\n" + "Mileage: " + mileage +" miles" + "\n";
   }
}
