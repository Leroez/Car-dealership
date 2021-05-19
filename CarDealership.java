
// @author Ben Rivera
import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;

public class CarDealership {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car[] cars = new Car[20];
         cars[0] = new Car("Ford", "Mustang", 1980, "55425", 25000, 30000);
        int choice;
        do {

            System.out.println("Welcome please choose an option or press 0 to end:\n 1.add a car\n 2.remove a car\n 3.the modify a car\n 4.See lowest priced car\n 5.see all cars on lot\n 6.see car info\n 7.see average mileage of cars on lot\n 8.make an offer ");
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    addCar(cars);

                    break;
                case 2: {

                    removeCar(cars);
                }
                break;

                case 3:
                    modifyCar(cars);
                    break;
                case 4:
                    getLowestPrice(cars);
                    break;
                case 5:
                    displayAllCars(cars);
                    break;
                case 6:
                    displayCarInfo(cars);
                    break;
                case 7:
                    calcAverage(cars);
                    break;
                case 8:
                    makeOffer(cars);
                    break;
            }
        } while (choice != 0);

       
         
    }// end of main method

    public static int getCount(Car[] cars) {

        int numOfCars = 0;
        for (int index = 0; index < cars.length; index++) {
            if (cars[index] == null) {
                break;
            } else {
                numOfCars += 1;
            }
        }

        return numOfCars;
    }

    public static void addCar(Car[] cars) {
        Scanner input = new Scanner(System.in);
        int numOfCars = getCount(cars);
        String make, model, vin;
        double price;
        int year, mileage;
        Car tester = new Car("Ford", "Mustang", 1980, "555", 2000, 3);
        if (numOfCars < cars.length) {

            System.out.println("What is the make of the car: ");
            make = input.nextLine();

            System.out.println("What is the model: ");
            model = input.nextLine();

            System.out.println("What is the Vin number: ");
            vin = input.nextLine();

            System.out.println("What year was the car made: ");
            year = input.nextInt();
            tester.setCarYear(year);
            while (year < 1970) {
                if (year < 1970) {
                    System.out.println("What is the year made: ");
                    year = input.nextInt();
                    tester.setCarYear(year);
                }
            }

            System.out.println("What is the price: ");
            price = input.nextDouble();
            tester.setPrice(price);
            while (price < 1000) {
                if (price < 1000) {
                    System.out.println("What is the price: ");
                    price = input.nextDouble();
                    tester.setPrice(price);
                }
            }

            System.out.println("What is the mileage: ");
            mileage = input.nextInt();
            tester.setMileage(mileage);
            while (mileage < 0) {
                if (mileage < 0) {
                    System.out.println("What is the price: ");
                    mileage = input.nextInt();
                    tester.setMileage(mileage);
                }
            }

            cars[numOfCars] = new Car(make, model, year, vin, price, mileage);
            cars[numOfCars].setCarMake(make);
            cars[numOfCars].setCarModel(model);
            cars[numOfCars].setCarYear(year);
            cars[numOfCars].setCarVin(vin);
            cars[numOfCars].setPrice(price);
            cars[numOfCars].setMileage(mileage);

        } else {
            System.out.println("Lot is full. Please press 0 to end");

        }

    }

    public static void removeCar(Car[] cars) {
        for (int i = 0; i < 1; i++) {
            if (cars[0] == null) {

            } else {
                System.out.println("1. " + cars[0].getCarMake() + " " + cars[0].getCarModel());
            }
            if (cars[1] == null) {

            } else {
                System.out.println("2. " + cars[1].getCarMake() + " " + cars[1].getCarModel());
            }
            if (cars[2] == null) {

            } else {
                System.out.println("3. " + cars[2].getCarMake() + " " + cars[2].getCarModel());
            }
            if (cars[3] == null) {

            } else {
                System.out.println("4. " + cars[3].getCarMake() + " " + cars[3].getCarModel());
            }
            if (cars[4] == null) {

            } else {
                System.out.println("5. " + cars[4].getCarMake() + " " + cars[4].getCarModel());
            }
            if (cars[5] == null) {

            } else {
                System.out.println("6. " + cars[5].getCarMake() + " " + cars[5].getCarModel());
            }
            if (cars[6] == null) {

            } else {
                System.out.println("7. " + cars[6].getCarMake() + " " + cars[6].getCarModel());
            }
            if (cars[7] == null) {

            } else {
                System.out.println("8. " + cars[7].getCarMake() + " " + cars[7].getCarModel());
            }
            if (cars[8] == null) {

            } else {
                System.out.println("9. " + cars[8].getCarMake() + " " + cars[8].getCarModel());
            }
            if (cars[9] == null) {

            } else {
                System.out.println("10. " + cars[9].getCarMake() + " " + cars[9].getCarModel());
            }
            if (cars[10] == null) {

            } else {
                System.out.println("11. " + cars[10].getCarMake() + " " + cars[10].getCarModel());
            }
            if (cars[11] == null) {

            } else {
                System.out.println("12. " + cars[11].getCarMake() + " " + cars[11].getCarModel());
            }
            if (cars[12] == null) {

            } else {
                System.out.println("13. " + cars[12].getCarMake() + " " + cars[12].getCarModel());
            }
            if (cars[13] == null) {

            } else {
                System.out.println("14. " + cars[13].getCarMake() + " " + cars[13].getCarModel());
            }
            if (cars[14] == null) {

            } else {
                System.out.println("15. " + cars[14].getCarMake() + " " + cars[14].getCarModel());
            }
            if (cars[15] == null) {

            } else {
                System.out.println("16. " + cars[15].getCarMake() + " " + cars[15].getCarModel());
            }
            if (cars[16] == null) {

            } else {
                System.out.println("17. " + cars[16].getCarMake() + " " + cars[16].getCarModel());
            }
            if (cars[17] == null) {

            } else {
                System.out.println("18. " + cars[17].getCarMake() + " " + cars[17].getCarModel());
            }
            if (cars[18] == null) {

            } else {
                System.out.println("19. " + cars[18].getCarMake() + " " + cars[18].getCarModel());
            }
            if (cars[19] == null) {

            } else {
                System.out.println("20. " + cars[19].getCarMake() + " " + cars[19].getCarModel());
            }
        }
        int choice;
        int numOfCars = getCount(cars);
        Scanner input = new Scanner(System.in);
        System.out.println("Which car do you want to remove: ");
        choice = input.nextInt();

        cars[choice - 1] = cars[cars.length - 1];
        for (int i = 0; i < numOfCars; i++) {
            if (cars[i] == null) {
                //Car temp = cars[i];
                cars[i] = cars[1];
                cars[1] = cars[2];
                cars[2] = cars[3];
                cars[3] = cars[4];
                cars[4] = cars[5];
                cars[5] = cars[6];
                cars[6] = cars[7];
                cars[7] = cars[8];
                cars[8] = cars[9];
                cars[9] = cars[10];
                cars[10] = cars[11];
                cars[11] = cars[12];
                cars[12] = cars[13];
                cars[13] = cars[14];
                cars[14] = cars[15];
                cars[15] = cars[16];
                cars[16] = cars[17];
                cars[17] = cars[18];
                cars[18] = cars[19];

            }
                System.out.println("Car was removed");
        }
       if (cars[0] == null) {

            } else {
                System.out.println("1. " + cars[0].getCarMake() + " " + cars[0].getCarModel());
            }
            if (cars[1] == null) {

            } else {
                System.out.println("2. " + cars[1].getCarMake() + " " + cars[1].getCarModel());
            }
            if (cars[2] == null) {

            } else {
                System.out.println("3. " + cars[2].getCarMake() + " " + cars[2].getCarModel());
            }
            if (cars[3] == null) {

            } else {
                System.out.println("4. " + cars[3].getCarMake() + " " + cars[3].getCarModel());
            }
            if (cars[4] == null) {

            } else {
                System.out.println("5. " + cars[4].getCarMake() + " " + cars[4].getCarModel());
            }
            if (cars[5] == null) {

            } else {
                System.out.println("6. " + cars[5].getCarMake() + " " + cars[5].getCarModel());
            }
            if (cars[6] == null) {

            } else {
                System.out.println("7. " + cars[6].getCarMake() + " " + cars[6].getCarModel());
            }
            if (cars[7] == null) {

            } else {
                System.out.println("8. " + cars[7].getCarMake() + " " + cars[7].getCarModel());
            }
            if (cars[8] == null) {

            } else {
                System.out.println("9. " + cars[8].getCarMake() + " " + cars[8].getCarModel());
            }
            if (cars[9] == null) {

            } else {
                System.out.println("10. " + cars[9].getCarMake() + " " + cars[9].getCarModel());
            }
            if (cars[10] == null) {

            } else {
                System.out.println("11. " + cars[10].getCarMake() + " " + cars[10].getCarModel());
            }
            if (cars[11] == null) {

            } else {
                System.out.println("12. " + cars[11].getCarMake() + " " + cars[11].getCarModel());
            }
            if (cars[12] == null) {

            } else {
                System.out.println("13. " + cars[12].getCarMake() + " " + cars[12].getCarModel());
            }
            if (cars[13] == null) {

            } else {
                System.out.println("14. " + cars[13].getCarMake() + " " + cars[13].getCarModel());
            }
            if (cars[14] == null) {

            } else {
                System.out.println("15. " + cars[14].getCarMake() + " " + cars[14].getCarModel());
            }
            if (cars[15] == null) {

            } else {
                System.out.println("16. " + cars[15].getCarMake() + " " + cars[15].getCarModel());
            }
            if (cars[16] == null) {

            } else {
                System.out.println("17. " + cars[16].getCarMake() + " " + cars[16].getCarModel());
            }
            if (cars[17] == null) {

            } else {
                System.out.println("18. " + cars[17].getCarMake() + " " + cars[17].getCarModel());
            }
            if (cars[18] == null) {

            } else {
                System.out.println("19. " + cars[18].getCarMake() + " " + cars[18].getCarModel());
            }
            if (cars[19] == null) {

            } else {
                System.out.println("20. " + cars[19].getCarMake() + " " + cars[19].getCarModel());
            }
        }

    

    public static double getLowestPrice(Car[] cars) {
      int name=0;
        int numOfCars = getCount(cars);
       Double smallest = cars[0].getPrice();
                double biggest = cars[0].getPrice();
               
                for(int i=0; i< numOfCars; i++){
                {
                         if (cars[i].getPrice() < smallest){
                                smallest = cars[i].getPrice();
                                name+= i;
                        }    
                }
        
       
    }
        System.out.printf("Lowest priced car is %s %s at $%.2f\n", cars[name].getCarMake(), cars[name].getCarModel(), smallest);
                                return smallest;
}
    public static void modifyCar(Car[] cars) {

        Scanner input = new Scanner(System.in);

        String newMake, newModel, newVin;
        int car, option, numOfChanges, newYear, newMileage;
        double newPrice;
        System.out.println("Which car do you want to modify? Please put the car number, or press 0 to retrun to main menu: ");
        for (int i = 0; i < 1; i++) {
            if (cars[0] == null) {

            } else {
                System.out.println("1. " + cars[0].getCarMake() + " " + cars[0].getCarModel());
            }
            if (cars[1] == null) {

            } else {
                System.out.println("2. " + cars[1].getCarMake() + " " + cars[1].getCarModel());
            }
            if (cars[2] == null) {

            } else {
                System.out.println("3. " + cars[2].getCarMake() + " " + cars[2].getCarModel());
            }
            if (cars[3] == null) {

            } else {
                System.out.println("4. " + cars[3].getCarMake() + " " + cars[3].getCarModel());
            }
            if (cars[4] == null) {

            } else {
                System.out.println("5. " + cars[4].getCarMake() + " " + cars[4].getCarModel());
            }
            if (cars[5] == null) {

            } else {
                System.out.println("6. " + cars[5].getCarMake() + " " + cars[5].getCarModel());
            }
            if (cars[6] == null) {

            } else {
                System.out.println("7. " + cars[6].getCarMake() + " " + cars[6].getCarModel());
            }
            if (cars[7] == null) {

            } else {
                System.out.println("8. " + cars[7].getCarMake() + " " + cars[7].getCarModel());
            }
            if (cars[8] == null) {

            } else {
                System.out.println("9. " + cars[8].getCarMake() + " " + cars[8].getCarModel());
            }
            if (cars[9] == null) {

            } else {
                System.out.println("10. " + cars[9].getCarMake() + " " + cars[9].getCarModel());
            }
            if (cars[10] == null) {

            } else {
                System.out.println("11. " + cars[10].getCarMake() + " " + cars[10].getCarModel());
            }
            if (cars[11] == null) {

            } else {
                System.out.println("12. " + cars[11].getCarMake() + " " + cars[11].getCarModel());
            }
            if (cars[12] == null) {

            } else {
                System.out.println("13. " + cars[12].getCarMake() + " " + cars[12].getCarModel());
            }
            if (cars[13] == null) {

            } else {
                System.out.println("14. " + cars[13].getCarMake() + " " + cars[13].getCarModel());
            }
            if (cars[14] == null) {

            } else {
                System.out.println("15. " + cars[14].getCarMake() + " " + cars[14].getCarModel());
            }
            if (cars[15] == null) {

            } else {
                System.out.println("16. " + cars[15].getCarMake() + " " + cars[15].getCarModel());
            }
            if (cars[16] == null) {

            } else {
                System.out.println("17. " + cars[16].getCarMake() + " " + cars[16].getCarModel());
            }
            if (cars[17] == null) {

            } else {
                System.out.println("18. " + cars[17].getCarMake() + " " + cars[17].getCarModel());
            }
            if (cars[18] == null) {

            } else {
                System.out.println("19. " + cars[18].getCarMake() + " " + cars[18].getCarModel());
            }
            if (cars[19] == null) {

            } else {
                System.out.println("20. " + cars[19].getCarMake() + " " + cars[19].getCarModel());
            }
        }
        car = input.nextInt();

        System.out.printf("%s %s was selected to modify\n", cars[car - 1].getCarMake(), cars[car - 1].getCarModel());
        System.out.println("How many changes do you want to make? ");
        numOfChanges = input.nextInt();

        for (int i = 0; i < numOfChanges; i++) {
            System.out.println("What would you like to change about this car? ");
            System.out.println("1. Modify Make \n2. Modify Model \n3.Modify VIN \n4. Modify Year \n5. Modify Price \n6. Modify Mileage");
            option = input.nextInt();

            if (option == 1) {
                System.out.println("Please enter a new make: ");
                newMake = input.nextLine();
                newMake = input.nextLine();
                cars[car - 1].setCarMake(newMake);

            }
            if (option == 2) {
                System.out.println("Please enter new model: ");
                newModel = input.nextLine();
                newModel = input.nextLine();
                cars[car - 1].setCarModel(newModel);
            }
            if (option == 3) {
                System.out.println("Please enter new VIN: ");
                newVin = input.nextLine();
                newVin = input.nextLine();
                cars[car - 1].setCarVin(newVin);
            }
            if (option == 4) {
                System.out.println("Please enter a new year: ");
                newYear = input.nextInt();

                cars[car - 1].setCarYear(newYear);

                if (newYear < 1970) {

                    newYear = input.nextInt();
                    cars[car - 1].setCarYear(newYear);
                }
            }

            if (option == 5) {
                System.out.println("Please enter a new price: ");

                newPrice = input.nextDouble();
                cars[car - 1].setPrice(newPrice);
                if (newPrice < 1000) {

                    newPrice = input.nextDouble();
                    cars[car - 1].setPrice(newPrice);
                }
            }
            if (option == 6) {
                System.out.println("Please enter a new mileage: ");
                newMileage = input.nextInt();

                cars[car - 1].setMileage(newMileage);
                if (newMileage < 0) {
                    newMileage = input.nextInt();
                    cars[car - 1].setMileage(newMileage);
                }
            }
        }
        System.out.printf("%s %s was succesfully modified.\n", cars[car - 1].getCarMake(), cars[car - 1].getCarModel());
    }

    public static double calcAverage(Car[] cars) {
        int numOfCars = getCount(cars);
       
        double average;
        int sum = 0;

        for (int i = 0; i < numOfCars; i++) {

            sum += cars[i].getMileage();

        }
        average = sum / numOfCars;
        System.out.printf("The average mileage is %.2f miles\n", average);
        return average;
    }

    public static void displayAllCars(Car[] cars) {

        cars = Arrays.stream(cars).filter(Objects::nonNull).toArray(Car[]::new);
        System.out.println(Arrays.toString(cars));
    }
    public static void displayCarInfo(Car[] cars){
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("Which car would you like to see the information for? Please enter their number: ");
         for (int i = 0; i < 1; i++) {
            if (cars[0] == null) {

            } else {
                System.out.println("1. " + cars[0].getCarMake() + " " + cars[0].getCarModel());
            }
            if (cars[1] == null) {

            } else {
                System.out.println("2. " + cars[1].getCarMake() + " " + cars[1].getCarModel());
            }
            if (cars[2] == null) {

            } else {
                System.out.println("3. " + cars[2].getCarMake() + " " + cars[2].getCarModel());
            }
            if (cars[3] == null) {

            } else {
                System.out.println("4. " + cars[3].getCarMake() + " " + cars[3].getCarModel());
            }
            if (cars[4] == null) {

            } else {
                System.out.println("5. " + cars[4].getCarMake() + " " + cars[4].getCarModel());
            }
            if (cars[5] == null) {

            } else {
                System.out.println("6. " + cars[5].getCarMake() + " " + cars[5].getCarModel());
            }
            if (cars[6] == null) {

            } else {
                System.out.println("7. " + cars[6].getCarMake() + " " + cars[6].getCarModel());
            }
            if (cars[7] == null) {

            } else {
                System.out.println("8. " + cars[7].getCarMake() + " " + cars[7].getCarModel());
            }
            if (cars[8] == null) {

            } else {
                System.out.println("9. " + cars[8].getCarMake() + " " + cars[8].getCarModel());
            }
            if (cars[9] == null) {

            } else {
                System.out.println("10. " + cars[9].getCarMake() + " " + cars[9].getCarModel());
            }
            if (cars[10] == null) {

            } else {
                System.out.println("11. " + cars[10].getCarMake() + " " + cars[10].getCarModel());
            }
            if (cars[11] == null) {

            } else {
                System.out.println("12. " + cars[11].getCarMake() + " " + cars[11].getCarModel());
            }
            if (cars[12] == null) {

            } else {
                System.out.println("13. " + cars[12].getCarMake() + " " + cars[12].getCarModel());
            }
            if (cars[13] == null) {

            } else {
                System.out.println("14. " + cars[13].getCarMake() + " " + cars[13].getCarModel());
            }
            if (cars[14] == null) {

            } else {
                System.out.println("15. " + cars[14].getCarMake() + " " + cars[14].getCarModel());
            }
            if (cars[15] == null) {

            } else {
                System.out.println("16. " + cars[15].getCarMake() + " " + cars[15].getCarModel());
            }
            if (cars[16] == null) {

            } else {
                System.out.println("17. " + cars[16].getCarMake() + " " + cars[16].getCarModel());
            }
            if (cars[17] == null) {

            } else {
                System.out.println("18. " + cars[17].getCarMake() + " " + cars[17].getCarModel());
            }
            if (cars[18] == null) {

            } else {
                System.out.println("19. " + cars[18].getCarMake() + " " + cars[18].getCarModel());
            }
            if (cars[19] == null) {

            } else {
                System.out.println("20. " + cars[19].getCarMake() + " " + cars[19].getCarModel());
            }
        }
         option = input.nextInt();
         System.out.println(cars[option -1]);
    }
    public static void makeOffer(Car[] cars){
       double price = 0;
        Scanner input = new Scanner(System.in);
        int option, confirmation, customer;
        System.out.println("What car are you offering? Please put its number: ");
         for (int i = 0; i < 1; i++) {
            if (cars[0] == null) {

            } else {
                System.out.println("1. " + cars[0].getCarMake() + " " + cars[0].getCarModel());
            }
            if (cars[1] == null) {

            } else {
                System.out.println("2. " + cars[1].getCarMake() + " " + cars[1].getCarModel());
            }
            if (cars[2] == null) {

            } else {
                System.out.println("3. " + cars[2].getCarMake() + " " + cars[2].getCarModel());
            }
            if (cars[3] == null) {

            } else {
                System.out.println("4. " + cars[3].getCarMake() + " " + cars[3].getCarModel());
            }
            if (cars[4] == null) {

            } else {
                System.out.println("5. " + cars[4].getCarMake() + " " + cars[4].getCarModel());
            }
            if (cars[5] == null) {

            } else {
                System.out.println("6. " + cars[5].getCarMake() + " " + cars[5].getCarModel());
            }
            if (cars[6] == null) {

            } else {
                System.out.println("7. " + cars[6].getCarMake() + " " + cars[6].getCarModel());
            }
            if (cars[7] == null) {

            } else {
                System.out.println("8. " + cars[7].getCarMake() + " " + cars[7].getCarModel());
            }
            if (cars[8] == null) {

            } else {
                System.out.println("9. " + cars[8].getCarMake() + " " + cars[8].getCarModel());
            }
            if (cars[9] == null) {

            } else {
                System.out.println("10. " + cars[9].getCarMake() + " " + cars[9].getCarModel());
            }
            if (cars[10] == null) {

            } else {
                System.out.println("11. " + cars[10].getCarMake() + " " + cars[10].getCarModel());
            }
            if (cars[11] == null) {

            } else {
                System.out.println("12. " + cars[11].getCarMake() + " " + cars[11].getCarModel());
            }
            if (cars[12] == null) {

            } else {
                System.out.println("13. " + cars[12].getCarMake() + " " + cars[12].getCarModel());
            }
            if (cars[13] == null) {

            } else {
                System.out.println("14. " + cars[13].getCarMake() + " " + cars[13].getCarModel());
            }
            if (cars[14] == null) {

            } else {
                System.out.println("15. " + cars[14].getCarMake() + " " + cars[14].getCarModel());
            }
            if (cars[15] == null) {

            } else {
                System.out.println("16. " + cars[15].getCarMake() + " " + cars[15].getCarModel());
            }
            if (cars[16] == null) {

            } else {
                System.out.println("17. " + cars[16].getCarMake() + " " + cars[16].getCarModel());
            }
            if (cars[17] == null) {

            } else {
                System.out.println("18. " + cars[17].getCarMake() + " " + cars[17].getCarModel());
            }
            if (cars[18] == null) {

            } else {
                System.out.println("19. " + cars[18].getCarMake() + " " + cars[18].getCarModel());
            }
            if (cars[19] == null) {

            } else {
                System.out.println("20. " + cars[19].getCarMake() + " " + cars[19].getCarModel());
            }
        }
         option = input.nextInt();
         System.out.printf("You have choosen %s %s", cars[option-1].getCarMake(), cars[option-1].getCarModel());
         
                     System.out.printf("%s %s List Price: $%.2f\n",cars[option-1].getCarMake(), cars[option-1].getCarModel(), cars[option-1].getPrice()); 
                     System.out.println("Does the customer: \n 1. Like the car \n 2. Somewhat like the car\n 3. not easily swayed\n");
                     customer = input.nextInt();
                    if(customer == 1){
                    price += cars[option-1].getPrice()-100;
                    System.out.printf("Price is $%.2f\n", price);
                    }else if(customer == 2){
                    price += cars[option-1].getPrice()-200;
                    System.out.printf("Price is $%.2f\n", price);
                    }else if(customer == 3){
                    price += cars[option-1].getPrice()-500;
                    System.out.printf("Price is $%.2f\n", price);
                    }
                    System.out.printf("%s %s sold for %.2f",cars[option-1].getCarMake(), cars[option-1].getCarModel(),price );
                 }
         }
    

