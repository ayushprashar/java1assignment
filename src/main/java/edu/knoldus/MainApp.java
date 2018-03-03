package edu.knoldus;

import edu.knoldus.Operations.Funtionalities;

import java.util.ArrayList;
import java.util.Random;

public class MainApp {
    public static void main(String[] args){
        Funtionalities check = new Funtionalities();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random randomGenrator = new Random();
        for(int count = 0;count<20;count++)
            list.add(randomGenrator.nextInt(100));
        System.out.println(list);
        System.out.println(check.primeListBuilder(list));
    }
}
