package main_package.implement;


import main_package.interfaces.Kharap;

public class Vaggo implements Kharap {
    public Vaggo() {
    }

    @Override
    public String kharap() {
        return "Vaggo Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
