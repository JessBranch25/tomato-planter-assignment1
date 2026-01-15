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
}
