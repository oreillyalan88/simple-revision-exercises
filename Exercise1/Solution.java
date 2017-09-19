import java.util.Scanner;

public class Solution {

    static Scanner kb = new Scanner(System.in);
    static String name;
    static String userName;
    static int age;

    public static void main(String[] args)  {

        System.out.print("What is your Name?: ");
        name = kb.next();
        System.out.print("How many years have you been on this planet?: ");
        age = kb.nextInt();
        System.out.print("What is your User Name?: ");
        userName = kb.next();


        System.out.print("Your name is "+name+", you are "+age+" years old, and your username is " +userName);


    }

    }



