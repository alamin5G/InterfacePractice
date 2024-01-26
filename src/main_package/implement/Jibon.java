package main_package.implement;


import main_package.interfaces.Kharap;

public class Jibon implements Kharap {
    public Jibon() {
    }

    @Override
    public String kharap() {
        return "Jibon main_package.interfaces.Kharap";
    }

    @Override
    public String toString() {
        return kharap();
    }
}
