package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.abstractClasses.Botanist;
import com.zipcodewilmington.froilansfarm.abstractClasses.Rider;
import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.Farmer;
import com.zipcodewilmington.froilansfarm.classes.food.Crop;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.classesTests.food.TomatoPlantTests;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void testFarmer() {
        Farmer jean = new Farmer();
        assertNotNull(jean);

    }

    @Test
    public void testFarmerExtends() {
        Farmer luke = new Farmer();
        assertTrue(luke instanceof Botanist);
        assertTrue(luke instanceof Rider);

    }

    @Test
    public void testplant(){
        Farmer luis = new Farmer();
        TomatoPlant laura = new TomatoPlant();
        CropRow julius = new CropRow();
        assertEquals(true, luis.plant( laura,julius ));

    }


}