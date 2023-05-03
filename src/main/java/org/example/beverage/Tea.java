package org.example.beverage;

import java.util.List;

public class Tea extends Beverage{
    public Tea(MugType mugType, Double ouncesOfWater) {
        super("Honey Tea", mugType, ouncesOfWater, List.of("Tea Bag"));
    }

    @Override
    protected boolean addMilk() {
        return true;
    }

    @Override
    protected boolean addHoney() {
        return true;
    }

    @Override
    protected boolean preferWarmWater() {
        return true;
    }
}
