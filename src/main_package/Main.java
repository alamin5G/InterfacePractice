package main_package;


import main_package.implement.*;
import main_package.interfaces.Kharap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Created a List for all the main_package.interfaces.Kharap
        List<Kharap> kharapList = new ArrayList<>();
        kharapList.add(new Vaggo());
        kharapList.add(new Future());
        kharapList.add(new Grades());
        kharapList.add(new Jibon());
        kharapList.add(new Mon());
        kharapList.add(new Mood());
        kharapList.add(new Shorir());
        kharapList.add( new Skin());

        Person p1 = new Person("Jeba",kharapList); // passing the kharap list
        System.out.println(p1);

        List<Kharap> alaminList = new ArrayList<>();
        alaminList.add(new Grades());
        alaminList.add(new Mood());
        Person p2 = new Person("Alamin", alaminList);
        System.out.println(p2);


        //another technique to implements the person with kharap list;
        Kharap jibon = new Jibon();
        Kharap mon = new Mon();
        Kharap mood = new Mood();
        Kharap grades = new Grades();
        Kharap shorir = new Shorir();

        Person me = new Person("Rakib", jibon, mon, mood);
        System.out.println(me.print());

        Person she = new Person("Fatima", grades, shorir, mon, mood, jibon);
        System.out.println(she.print());



    }

}
