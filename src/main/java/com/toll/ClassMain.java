package com.toll;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class ClassMain {
    private static final String[] val= new String[] {"1c","1t","1s","1b","2c","2t","2s",
            "2b","3c","3t","3s","3b","4c","4t","4s","4b","0"};
    private static final ArrayList<String> value=new ArrayList<>(Arrays.asList(val));
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBooth T1 = new TollBooth(1);
        TollBooth T2 = new TollBooth(2);
        TollBooth T3 = new TollBooth(3);
        TollBooth T4 = new TollBooth(4);
        String str;
        System.out.println("There are four tollbooths and types of vehicles"
                + " are: Car, Truck, Scooter, Bike");
        System.out.println("Number represents the tollbooth number "
                + "and letter represents the type of vehicle");
        System.out.println("s:all two wheelers(bikes and scooters)\n"
                + "c:cars\nt: trucks\nb: buses\n ");
        System.out.println("Enter tollbooth number and vehicle from "
                + "the following list:");
        System.out.println(value);
        System.out.println("Enter 0 to print and exit the application");
        System.out.println("Press enter after each entry!");
        do {
            str=sc.nextLine();
            try {
                validate(str);
            }
            catch(Exception e) {
                System.out.println(e.getMessage() + " Please enter a valid value");
                continue;
            }
            if(str.contains("1")) {
                T1.add(str);
            }
            else if(str.contains("2")) {
                T2.add(str);
            }
            else if(str.contains("3")) {
                T3.add(str);
            }
            else if(str.contains("4")) {
                T4.add(str);
            }
            else if(str.contains("0")) {
                break;
            }
        }while(!Objects.equals(str, "0"));
        T1.printToll();
        T2.printToll();
        T3.printToll();
        T4.printToll();
        System.out.println("Total count= "+(Vehicle.count)+
                "\tTotal toll= "+(Vehicle.totcost));
    }
    private static void validate(String str) throws Exception {
        if(str == null || str.length()==0)
            throw new Exception("Empty string");
        if(!value.contains(str))
            throw new Exception("Invalid string");
    }
}
