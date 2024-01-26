package main_package.implement;


import main_package.interfaces.Kharap;

public class Mood implements Kharap {
    public Mood() {
    }
    @Override
    public String kharap() {
        return "Mood  Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
