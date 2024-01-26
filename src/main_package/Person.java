package main_package;


import main_package.interfaces.Kharap;

import java.util.List;

public class Person {
    private String name ;
    private List<Kharap> kharapList;
    private Kharap[] kharap;

    public Person(String name, List<Kharap>  kharap) {
        this.name = name;
        kharapList = kharap;
    }

    public Person(String name, Kharap... kharap) {
        this.name = name;
        this.kharap = kharap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Kharap> getKharap() {
        return kharapList;
    }


    @Override
    public String toString() {
        return   name + " er " +kharapList.toString();
    }


    /**
     *
     * @return name and string from implements;
     */
    public String print(){
        String st= "";
        for (Kharap kharap1 : kharap){
            st += kharap1;
            st += ", ";
        }
        return name + " er " + st;
    }

}
