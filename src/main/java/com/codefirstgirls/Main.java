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
        String[] tomatoVarieties = {"Gardener's Delight", "Tumbling Tom", "Sungold", "Black Cherry", "Green Zebra"};
        for (String t :tomatoVarieties){
            System.out.println(t);
        }

        String tomatoChoice = scanner.nextLine();
        System.out.println("*******************************");
        System.out.println("THANKS! HOW MANY WOULD YOU LIKE TO PLANT?");
        int amountToCreate = scanner.nextInt();

        //create an array list to store the tomatoes - created using the parent class so can store any tomato type
        ArrayList<Tomato> plantedTomatoes = new ArrayList<Tomato>();


        //create the items based on user input
        switch (tomatoChoice){
            case "Gardener's Delight":
                for (int i = 0; i < amountToCreate; i++) {
                    GardenersDelight gardenersDelight = new GardenersDelight();
                    plantedTomatoes.add(gardenersDelight);
                }
                break;
            case "Tumbling Tom":
                for (int i = 0; i < amountToCreate; i++) {
                    TumblingTom tumblingTom = new TumblingTom();
                    plantedTomatoes.add(tumblingTom);
                }
                break;
            case "Sungold":
                for (int i = 0; i < amountToCreate; i++) {
                    Sungold sungold = new Sungold();
                    plantedTomatoes.add(sungold);
                }
                break;
            case "Black Cherry":
                for (int i = 0; i < amountToCreate; i++) {
                    BlackCherry blackCherry = new BlackCherry();
                    plantedTomatoes.add(blackCherry);
                }
                break;
            case "Green Zebra":
                for (int i = 0; i < amountToCreate; i++) {
                    GreenZebra greenZebra = new GreenZebra();
                    plantedTomatoes.add(greenZebra);
                }
                break;
            default:
                //handle errors
                System.out.println("Invalid tomato selection, please try again");
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
                String species = plantedTomatoes.get(i).getSpecies();
                System.out.println(species+" tomato "+(i+1)+" is called "+name);
            }

            System.out.println("*******************************");
            System.out.println("PLEASE LOVE AND CARE FOR YOUR TOMATOES, TALKING TO YOUR TOMATOES IS A NICE WAY TO REMIND THEM THAT YOU LOVE THEM");
        }


    }

}