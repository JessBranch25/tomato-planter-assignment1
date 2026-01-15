package com.codefirstgirls;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Scanner class is used to get user input

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE TOMATO PLANTER");
        System.out.println("*******************************");
        System.out.println("PLEASE ENTER ONE OF THE FOLLOWING TOMATOES TO PLANT");

        //print out your list here
        System.out.println("Gardener's Delight,\nTumbling tom,\nSungold,\nBlack Cherry,\nGreen Zebra");

        String tomatoChoice = scanner.nextLine();
        System.out.println("THANKS! HOW MANY WOULD YOU LIKE TO PLANT?");
        String amountToCreate = scanner.nextLine();

        // create the items, and output to the user as appropriate

    }
}