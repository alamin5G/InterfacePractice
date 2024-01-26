package main_package.implement;


import main_package.interfaces.Kharap;

public class Mon implements Kharap {
    public Mon() {
    }

    @Override
    public String kharap() {
        return "Mon main_package.interfaces.Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}

