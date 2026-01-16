package com.codefirstgirls;

public class Tomato extends Plant {
    private String species;
    private TomatoType tomatoType;
    private String fruitColour;
    private String taste;

    //create constructor
    public Tomato(String species, TomatoType tomatoType, String fruitColour, String taste) {
        super("Tomato", Lifespan.ANNUAL);
        this.species = species;
        this.tomatoType = tomatoType;
        this.fruitColour = fruitColour;
        this.taste = taste;

    }

    //create getters for all tomato attributes
    public String getSpecies(){
        return species;
    }

    public TomatoType getTomatoType(){
        return tomatoType;
    }

    public String getFruitColour(){
        return fruitColour;
    }

    public String getTaste(){
        return taste;
    }

    //create method to return tomato information
    public void printTomatoInformation(){
        String typeString = convertTomatoTypeToString();

        System.out.println(species+" tomatoes are "+typeString+" tomatoes with a "+fruitColour+" colour and "+taste+" flavour");
    }

    //needs a helper function to convert the tomato type to a string, did this using a switch statement to practice them
    private String convertTomatoTypeToString(){
        String tomatoTypeString = "";

        switch (tomatoType){
            case TomatoType.CHERRY:
                tomatoTypeString = "cherry";
                break;
            case TomatoType.BEEF:
                tomatoTypeString = "beef";
                break;
            case TomatoType.PLUM:
                tomatoTypeString = "plum";
                break;
            case TomatoType.HERITAGE:
                tomatoTypeString = "heritage";
                break;
        }

        return tomatoTypeString;
    }
}
