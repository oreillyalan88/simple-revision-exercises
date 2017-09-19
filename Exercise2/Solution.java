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
            BMI = bmiCalculator(weight,height);
            System.out.printf(name+ " your current Body Mass Index Reading is : "+"%.2f  \n",BMI);
            System.out.println("These results mean that you are "+bmiInterpreter(BMI)+".");





    }
    
        static float bmiCalculator(double w, double h){
            
            float BMI;
            
            BMI=(float)(w/(h*h))*10000;
            
            return BMI;
            
        }
    
        static String bmiInterpreter(float bmi) {
        
                String interpret = "";
            
                if (bmi < 18.5 ) {
                    interpret= "Underweight";
                }
        
                else if (bmi >= 18.5 && bmi < 25) {
                   interpret= "Normal Weight";
                }
        
                else if (bmi >= 25 && bmi < 30) {
                    interpret= "Overweight";
                }
        
                else if (bmi >= 30) {
                   interpret= "Obese";
                }
            return interpret;
    }

    }



