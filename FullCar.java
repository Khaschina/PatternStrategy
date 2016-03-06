package com.Ekhschina.PatternStrategy;

/**
 * Created by 222 on 06.03.2016.
 */
public class FullCar implements OfferCar {
    @Override
    public int offerCar() {
        return 325000+150000;
    }
}
