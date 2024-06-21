package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.print("Enter your exam score : ");
        int score = scanner.nextInt();

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Score: "+ score);
        if(score>=90){
            System.out.println("Grade: A");
        }
        else if(score>=80 && score <=89){
            System.out.println("Grade: B");
        }
        else if(score>=70 && score <=79){
            System.out.println("Grade: C");
        }
        else if(score>=60 && score <=69){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
        

        // Print the student's details
        

       
    }
}
