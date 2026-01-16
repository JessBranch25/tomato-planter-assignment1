package com.codefirstgirls;


abstract class Plant {
    private String plantName;
    private Lifespan lifespan;

    public Plant(String plantName, Lifespan lifespan) {
        this.plantName = plantName;
        this.lifespan = lifespan;
    }
}
