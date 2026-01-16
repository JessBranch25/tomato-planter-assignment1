package com.codefirstgirls;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Scanner class is used to get user input

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE TOMATO PLANTER");
        System.out.println("*******************************");
        System.out.println("PLEASE ENTER ONE OF THE FOLLOWING TOMATOES TO PLANT");

        //print out your list here
        System.out.println("Gardener's Delight,\nTumbling Tom,\nSungold,\nBlack Cherry,\nGreen Zebra");

        String tomatoChoice = scanner.nextLine();
        System.out.println("*******************************");
        System.out.println("THANKS! HOW MANY WOULD YOU LIKE TO PLANT?");
        int amountToCreate = scanner.nextInt();

        //create an array list to store the tomatoes - created using the parent class so can store any tomato type
        ArrayList<Tomato> plantedTomatoes = new ArrayList<Tomato>();

        //create the items based on user input
        switch (tomatoChoice){
            case "Gardener's Delight":
                System.out.println("Sorry that tomato isn't ready for planting yet");
                break;
            case "Tumbling Tom":
                System.out.println("Sorry that tomato isn't ready for planting yet");
                break;
            case "Sungold":
                for (int i = 0; i < amountToCreate; i++) {
                    Sungold sungold = new Sungold();
                    plantedTomatoes.add(sungold);
                }
                break;
            case "Black Cherry":
                System.out.println("Sorry that tomato isn't ready for planting yet");
                break;
            case "Green Zebra":
                System.out.println("Sorry that tomato isn't ready for planting yet");
                break;
        }

        //display planted tomatoes
        if (!plantedTomatoes.isEmpty()) {
            System.out.println("*******************************");
            System.out.println("YOU'VE PLANTED "+plantedTomatoes.size()+" "+tomatoChoice.toUpperCase()+" TOMATOES");
            System.out.println("*******************************");
            System.out.println("YOUR TOMATO CHARACTERISTICS ARE AS FOLLOWS:");
            plantedTomatoes.getFirst().printTomatoInformation();
            System.out.println("*******************************");
            System.out.println("YOUR TOMATO PLANTS HAVE CUTE NAMES SO THAT YOU CAN TALK TO THEM");

            for (int i = 0; i < plantedTomatoes.size(); i++) {
                String name = plantedTomatoes.get(i).getName();
                System.out.println("Tomato "+(i+1)+" is called "+name);
            }

            System.out.println("*******************************");
            System.out.println("PLEASE LOVE AND CARE FOR YOUR TOMATOES, TALKING TO YOUR TOMATOES IS A NICE WAY TO REMIND THEM THAT YOU LOVE THEM");
        }


    }

}