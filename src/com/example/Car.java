package com.example;

/**
 * Created by Chernykh on 04.09.2022
 */
public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("startElectricity");

    }

    private void startCommand() {
        System.out.println("startCommand");
    }

    private void startFuelSystem(){
        System.out.println("startFuelSystem");
    }

}
