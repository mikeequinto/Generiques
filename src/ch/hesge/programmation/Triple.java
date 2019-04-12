package ch.hesge.programmation;

import java.util.Date;

public class Triple {

    /*public <T extends Number, R extends Number> double addition(T t, R r){
        double somme = t.doubleValue() + r.doubleValue() ;
        return somme;
    }*/

    Object first, second, third;

    public Triple(Object first, Object second, Object third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    public Object getThird() {
        return third;
    }

    public static void main(String[] args) {
        Triple triple = new Triple("Hello", new Date(), 15);
        String s = triple.getFirst();
        Date d = triple.getSecond();
        Integer i = triple.getThird();
    }
}
