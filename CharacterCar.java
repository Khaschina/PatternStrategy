package com.Ekhschina.PatternStrategy;

/**
 * Created by 222 on 06.03.2016.
 */
public abstract class CharacterCar {

    OfferCar offerCar;

    CharacterCar()
    {

    }

    public int callOfferCar()
    {
        return offerCar.offerCar();
    }
    abstract void description();
}
