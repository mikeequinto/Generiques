package ch.hesge.programmation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comprehension {

    public static void main(String[] args) {

        /*ArrayList<Integer> integers = new ArrayList<Integer>(); //compile
        List<Integer> integers2 = new ArrayList<>(); //compile depuis java ..
        List<? extends Integer> integers3 = new ArrayList<>(); //compile car ArrayList est une sous-classe de List
        List<? extends Integer> integers4 = new ArrayList<?>(); //compile pas car ? n'extend pas forcément Integer

        List<? extends Integer> integers5 = new ArrayList<>();
        integers5.add(1); //compile pas car ArrayList ne sait pas ce qu'il va recevoir

        List<? extends Integer> integers6 = Arrays.asList(1, 2, 3);
        integers6.get(1); //compile car l'array a été initialisé pour avoir des int

        List<? super Integer> numbers = new ArrayList<>();
        numbers.add(1); //compile car ArrayList recoit un Integer ou une superclasse d'Integer

        List<? super Integer> numbers2 = Arrays.asList(1, 2, 3);
        numbers.get(1);//compile on peut lire mais pas écrire*/


    }

}
