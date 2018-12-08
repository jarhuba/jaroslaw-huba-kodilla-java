package com.kodilla.rps.main;

import java.util.Random;

public class Human {

    private String rps = "";
    private String name = "human";

    public Human() {
    }

    public void setRps(String rps) {

        this.rps = rps;
    }

    public String getRps() {
        return rps;
    }

    public String getName() {
        return name;
    }
}
