package main_package.implement;


import main_package.interfaces.Kharap;

public class Grades implements Kharap {
    public Grades() {
    }
    @Override
    public String kharap() {
        return "Grades main_package.interfaces.Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
