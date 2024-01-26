package main_package;


import main_package.interfaces.Kharap;

import java.util.List;

public class Person {
    private String name ;
    private List<Kharap> kharaps;

    public Person(String name, List<Kharap>  kharap) {
        this.name = name;
        kharaps = kharap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Kharap> getKharap() {
        return kharaps;
    }


    @Override
    public String toString() {
        return   name + " er " +kharaps.toString();
    }


}
