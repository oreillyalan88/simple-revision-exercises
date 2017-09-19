import java.util.Scanner;
import java.lang.Character;


public class Solution {

    static Scanner kb = new Scanner(System.in);
    static String name;
    static char sex;
    static double weight;
    static double height;
    static float BMI; 

        public static void main(String[] args)  {
    
            System.out.println("Please enter the following details to recieve your Body Mass Index.");
            System.out.print("What is your Name?: ");
            name = kb.next();
            System.out.print("What is your Sex (M or F) ?: ");
            sex = Character.toLowerCase(kb.next(".").charAt(0));
            System.out.print("What is your Weight in kg?: ");
            weight = kb.nextInt();
            System.out.print("What is your height in cm's?: ");
            height = kb.nextInt();
            BMI = bmiCalculator(weight,height);
            System.out.printf(name+ " your current Body Mass Index Reading is : "+"%.2f  \n",BMI);
            System.out.println("These results mean that you are "+bmiInterpreter(BMI)+".");
            System.out.println("Your reccommended BMI is "+idealBMI(weight, height, sex)+".");
            
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
    
    
            static float idealBMI(double w, double h, char sex) {
                
        //Hamwi Idea Body Weight formula
                float heightTreshold = 152.4;
                float femaleWeightTreshold = 45.36;
                float maleWeightTreshold = 48.00;
                float heightIncrament = 2.54;
                float femaleWeightIncrament = 2.26;
                float maleWeightIncrament = 2.72;
                float idealBMI;
                float idealBodyWeight;
                
            switch (sex){
            case 'm': 

            if (h > heightTreshold) {
            float difference = h - heightTreshold;
            idealBodyWeight = 48.00 + ((difference/2.54)*2.72);
            idealBMI = bmiCalculator(idealBodyWeight,h);
            }
            break;
            }
            //     if (bmi < 18.5 ) {
            //         interpret= "Underweight";
            //     }
        
            //     else if (bmi >= 18.5 && bmi < 25) {
            //       interpret= "Normal Weight";
            //     }
        
            //     else if (bmi >= 25 && bmi < 30) {
            //         interpret= "Overweight";
            //     }
        
            //     else if (bmi >= 30) {
            //       interpret= "Obese";
            //     }
             return idealBMI;
    }



    }



