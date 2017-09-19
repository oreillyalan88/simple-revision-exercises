import java.util.Scanner;

public class Solution {

    static Scanner kb = new Scanner(System.in);
    static String name;
    static double weight;
    static double height;
    static float BMI; 

    public static void main(String[] args)  {

        System.out.println("Please enter the following details to recieve your Body Mass Index.");
        System.out.print("What is your Name?: ");
        name = kb.next();
        System.out.print("What is your Weight in kg?: ");
        weight = kb.nextInt();
        System.out.print("What is your height in cm's?: ");
        height = kb.nextInt();
        BMI = (float)(weight/(height*height))*10000;

        System.out.printf(name+ " your current Body Mass Index Reading is : "+"%.2f",BMI);





    }

    }



