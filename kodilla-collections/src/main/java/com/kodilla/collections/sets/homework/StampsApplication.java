package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Eiffel","43 mm x 31,25", true));        //1
        stamps.add(new Stamp("Zygfryt", "39,5 mm x 31,25mm", true));  //2
        stamps.add(new Stamp("Safari", "90 mm x 70 mm", false));      //3
        stamps.add(new Stamp("Agit","90 mm x 70 mm", true));          //4
        stamps.add(new Stamp("Temple","43 mm x 31,25", false));       //5
        stamps.add(new Stamp("Elmon","90 mm x 70 mm", true));         //6
        stamps.add(new Stamp("Eiffel","43 mm x 31,25", true));        //7

        System.out.println("Rozmiar kolekcji: " + stamps.size());
        for(Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
