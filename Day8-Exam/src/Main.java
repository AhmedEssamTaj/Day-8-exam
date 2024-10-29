/*
Author: Ahmed Essam Taj
Date: 29, October
Day 8 Exam

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// Q1/ Write a Java program that accept three numbers from the user and print the largest number

        System.out.println("======================= Q1 =======================");
        System.out.println("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the third number: ");
        int thirdNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("the largest number is : ");
        findlargest(firstNumber,secondNumber,thirdNumber);
        System.out.println();


// Q2/ Write a Java program that accept a String and a number from the user,
// then print the character in the given index

        System.out.println("======================= Q2 =======================");
        System.out.println("Please enter a string : ");
        String string = scanner.nextLine();
        int index;
        do {
            System.out.println("please enter the number of the index NOTE:" +
            " Must be least then or equal to "
             +((string.length())-1) +" : ");
           index = scanner.nextInt();
        }while (index>=string.length() || index<0 );

        System.out.println("the character in index "+index+" is : "+string.charAt(index));

// Q3/  Write a program to enter the numbers till the user
// wants and at the end it should display the sum entered

        System.out.println("======================= Q3 =======================");
        System.out.println("Please Enter the amount of numbers you want to enter : ");
        scanner.nextLine();
        int amountOfNumbers = scanner.nextInt();
        int sum = calSum (amountOfNumbers);
        System.out.println("The sum of the numbers entered is : "+sum);


// Q4/ Write a Java program to find positive and negative numbers of a given array
       System.out.println("======================= Q4 =======================");
       int [] array = {10, -21 , 30, 31, -25};

       printTypeOfNum (array);


// Q5/ Write a Java program to find a shortest word of a given array

        System.out.println("======================= Q5 =======================");
        String [] strArray = {"Tuwaiq","Bootcamp","Student","JAVA"};

        findShortestString (strArray);




    }

    // Method for Q1..
    public static void findlargest(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.print(firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.print(secondNumber);
        }else
            System.out.println(thirdNumber);
    }

// Method for Q3..
public  static int calSum(int amountOfNumbers) {
    Scanner scanner = new Scanner(System.in);
    int sum =0;
    for (int i = 0; i < amountOfNumbers; i++) {
        System.out.println("Please enter number ("+(i+1)+") : ");
        int number = scanner.nextInt();
        sum += number;
    }
 return sum;
}

// Method for Q4..
public static void printTypeOfNum (int[] array) {

    for (int a : array) {
        if (a > 0)
            System.out.println(a + " is a positive number");

         else if (a < 0)
            System.out.println(a + " is a negative number");
         else
            System.out.println(" number is Zero");

    }
}

// Method for Q5
public static void findShortestString (String[] strArray) {

        String shortest = strArray[0];
        for(String str : strArray) {
            if (str.length()<=shortest.length())
                shortest = str;
        }
    System.out.println("the shortest string is : "+shortest);
}

}