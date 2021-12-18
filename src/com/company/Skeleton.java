package com.company;

public class Skeleton extends Boss {
    private String firstShot;

    public Skeleton(int health, int damage, String power) {
        super(health, damage, power);
    }


    public String printInfo(){
        return  super.printInfo() + "\nКол-во стрел:" + getFirstShot();
    }


    public String getFirstShot() {
        return firstShot;
    }

    public void setFirstShot(String firstShot) {
        this.firstShot = firstShot;
    }
}
