package main_package.implement;


import main_package.interfaces.Kharap;

public class Shorir implements Kharap {
    public Shorir() {
    }
    @Override
    public String kharap() {
        return "Shorir Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
