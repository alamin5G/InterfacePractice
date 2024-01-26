package main_package.implement;


import main_package.interfaces.Kharap;

public class Skin implements Kharap {
    public Skin() {
    }

    @Override
    public String kharap() {
        return "Skin main_package.interfaces.Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
