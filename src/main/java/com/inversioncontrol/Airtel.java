package com.inversioncontrol;
public class Airtel implements Sim{
    @Override
    public void calling() {
       System.out.println("Calling using Airtel mobile");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Airtel sim");
    }
}
