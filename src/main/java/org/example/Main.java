package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void addNumbers(){

        List<Integer> numbers = new ArrayList<>(){};
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);


        for (int number : numbers){
            if (number != 4){

                System.out.println(number);
            } else {
                System.out.println("Eroooooor CATCH NUM " + number);
                continue;
            }


            number= number + 10;
            System.out.println("New number" + number);
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        addNumbers();
    }

}