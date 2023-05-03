package org.example.beverage;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    private final String nameOfBeverage;
    private final MugType mugType;
    private Double ouncesOfWater;
    private List<String> ingredients = new ArrayList<>();

    public Beverage(String nameOfBeverage, MugType mugType, Double ouncesOfWater, List<String> ingredients) {
        this.nameOfBeverage = nameOfBeverage;
        this.mugType = mugType;
        this.ouncesOfWater = ouncesOfWater;
        this.ingredients = ingredients;
    }

    public void prepareBeverage() {
        getMug();
        addSpecialIngredient(this.ingredients);
        if(addMilk()) System.out.println("Adding Milk");
        if(addSugar()) System.out.println("Adding Sugar");
        if (addHoney()) System.out.println("Adding Honey");
        if(preferWarmWater()){
            System.out.println("Warming "+ouncesOfWater+" of water and pouring into mug");

        } else {
            System.out.println("Pouring "+ouncesOfWater+" of cold water into the mug");
        }
        stirBeverage();
        serveBeverage();
    }

    private void getMug() {
        System.out.println("Getting a "+this.mugType+" Mug");
    }

    protected void addSpecialIngredient(List<String> ingredients) {
        for(String i : ingredients){
            System.out.println("Pouring "+i+" into the Mug");
        }
    };

    protected boolean addMilk() {
         return false;
     }

    protected boolean addSugar() {
        return false;
    }

    protected boolean addHoney() {
        return false;
    }

    protected boolean preferWarmWater() {
        return false;
    }

    private void stirBeverage() {
        System.out.println("Stirring "+ this.nameOfBeverage + " Beverage");
    }

    private void serveBeverage() {
        System.out.println("Serve " + nameOfBeverage);
    }

}
