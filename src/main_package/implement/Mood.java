package main_package.implement;


import main_package.interfaces.Kharap;

public class Mood implements Kharap {
    public Mood() {
    }
    @Override
    public String kharap() {
        return "Mood main_package.interfaces.Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
