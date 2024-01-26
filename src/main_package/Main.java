package main_package;


import main_package.implement.*;
import main_package.interfaces.Kharap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Kharap vaggo = new Vaggo();
        Kharap future = new Future();
        Kharap grades = new Grades();
        Kharap jibon = new Jibon();
        Kharap mon = new Mon();
        Kharap mood = new Mood();
        Kharap shorir = new Shorir();
        Kharap skin = new Skin();

        //Created a List for all the main_package.interfaces.Kharap
        List<Kharap> kharapList = new ArrayList<>();

        kharapList.add(vaggo);
        kharapList.add(future);
        kharapList.add(grades);
        kharapList.add(jibon);
        kharapList.add(mon);
        kharapList.add(mood);
        kharapList.add(shorir);
        kharapList.add(skin);



    Person p1 = new Person("Jeba",kharapList); // passing the kharap list
        System.out.println(p1);

    }

}
