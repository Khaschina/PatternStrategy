package com.Ekhschina.PatternStrategy;

/**
 * Created by 222 on 06.03.2016.
 */
public class CommonCar implements OfferCar {


    @Override
    public int offerCar() {
        return 350000 + 25000;
    }
}
