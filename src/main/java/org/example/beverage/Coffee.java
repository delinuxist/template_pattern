package org.example.beverage;

import java.util.List;

public class Coffee extends Beverage{

    public Coffee( MugType mugType, Double ouncesOfWater) {
        super("Coffee", mugType, ouncesOfWater, List.of("Coffee"));
    }

    @Override
    protected boolean addMilk() {
        return true;
    }

    @Override
    protected boolean addSugar() {
        return true;
    }

    @Override
    protected boolean preferWarmWater() {
        return true;
    }
}
