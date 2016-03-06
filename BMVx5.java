package com.Ekhschina.PatternStrategy;

/**
 * Created by 222 on 06.03.2016.
 */
public class BMVx5 {
    public static void main(String[] args) {
        CharacterCar basicBMVx5 = new BasicBMVx5();
        basicBMVx5.description();
        System.out.println(basicBMVx5.callOfferCar());

        CharacterCar commonBMVx5 = new CommonBMVx5();
        commonBMVx5.description();
        System.out.println(commonBMVx5.callOfferCar());
    }
}
