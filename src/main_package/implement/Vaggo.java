package main_package.implement;


import main_package.interfaces.Kharap;

public class Vaggo implements Kharap {
    public Vaggo() {
    }

    @Override
    public String kharap() {
        return "Vaggo main_package.interfaces.Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
