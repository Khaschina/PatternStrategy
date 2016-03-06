package com.Ekhschina.PatternStrategy;

/**
 * Created by 222 on 06.03.2016.
 */
public class BasicBMVx5 extends CharacterCar {

    BasicBMVx5()
    {
        offerCar = new BasicCar();
    }
    @Override
    void description() {
        System.out.println("Only basic assembly");
    }
}
