package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;

public class PotatoPlant implements Crop<Potato> {
    boolean hasBeenFertilized = false;

    @Override
    public void setHasBeenFertilized(boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }
    @Override
    public boolean getHasBeenFertilized(){
        return this.hasBeenFertilized;
    }


    @Override
    public Potato yield(Boolean hasBeen) {
        if(this.hasBeenFertilized && hasBeen){
            return new Potato();
        }
        return null;
    }
}
