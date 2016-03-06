package com.Ekhschina.PatternStrategy;

/**
 * Created by 222 on 06.03.2016.
 */
public class CommonBMVx5 extends CharacterCar {


    CommonBMVx5()
    {
        offerCar = new CommonCar();
    }

    @Override
    void description() {
        System.out.println("Common assembly");
    }
}
