package org.example;


import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Please enter your year of birth:");

        int birthYear = scanner.nextInt();
        int age = LocalDate.now().getYear() - birthYear;

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

       String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};


        String generatedCode = "";
        int numberOfPoints = 0;

        for (int i = 1; i <= 6; i++) {

            Random random = new Random();
            int random_int = random.nextInt(26);
            generatedCode = generatedCode + alphabet[random_int];
            switch (alphabet[random_int]) {
                case "a" -> numberOfPoints = numberOfPoints + 1;
                case "e" -> numberOfPoints = numberOfPoints + 2;
                case "i" -> numberOfPoints = numberOfPoints + 3;
                case "o" -> numberOfPoints = numberOfPoints + 4;
                case "u" -> numberOfPoints = numberOfPoints + 5;
            }
        }

        if (numberOfPoints == 0) {
            numberOfPoints = numberOfPoints + 100;
        }

        System.out.println("Number of points: " + numberOfPoints);

        double prizeMoney = Double.parseDouble(String.valueOf(age)) / 10 * numberOfPoints;
        System.out.println("Generated code: " + generatedCode);
        System.out.println("Christmas Gift: R" + String.format("%.2f", prizeMoney));

      






    }
}