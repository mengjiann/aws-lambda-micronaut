package com.mj.power_of_three.service;

import javax.inject.Singleton;

@Singleton
public class PowerOfNumberService {

    public Integer toPowerOf(Integer base, Integer exponent){
        return (int) Math.pow(base,exponent);
    }

}
