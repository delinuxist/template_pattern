package org.example.beverage;

import java.util.List;

public class ThisWay extends Beverage {
    public ThisWay(MugType mugType, Double ouncesOfWater) {
        super("This Way Chocolate Drink", mugType, ouncesOfWater, List.of("ThisWay Cocoa Powder"));
    }

    @Override
    protected boolean preferWarmWater() {
        return true;
    }
}
