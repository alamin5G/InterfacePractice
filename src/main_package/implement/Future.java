package main_package.implement;


import main_package.interfaces.Kharap;

public class Future implements Kharap {
    public Future() {
    }

    @Override
    public String kharap() {
       return "Future Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
