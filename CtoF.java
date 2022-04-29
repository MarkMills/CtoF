//Markalan Mills
//Feb 2 2022
import java.util.Scanner;
//import scanner
class CtoF {
    //Create class
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //create scanner
        System.out.println("Enter a degree in celsius:");
        //print question
        double C = input.nextDouble();
        //ask user for input
        double F = (9 / 5) * C + 32;
        //Convert Celsius to Fahrenheit
        System.out.println(C +" Celsius is "+ F +" Fahrenheit.");
        //print the conversion
    }
}