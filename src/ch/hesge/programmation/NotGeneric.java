package ch.hesge.programmation;

public class NotGeneric {

    //public void apply(T t){} //compile pas car on ne sait pas ce que T est
    //public <T> void apply (T t){} //compile
    //public <V extends T> void apply(T t){} // 27) compile pas on ne sait pas ce qu'est T
    //pareil pour T extends V 28)
    //public <T extends Number> void apply(T t){} // 29) compile

    /*public <T> R apply(T t){
        return (R) new Object(); // 30) compile pas on ne sait pas R
    }*/

    /*public <T,R> R apply(T t){
        return (R) new Object(); // 31) compile
    }*/

    /*public <T, R extends Number> R apply(T t){
        return (R) new Object(); // 32) compile
    }*/

    /*public <T, R super Number> R apply(T t){
        return (R) new Object(); // 33) compile pas ?
    }*/

    public <T, R extends Number> R apply(T t){
        return (R) Integer.valueOf(1); // 34) compile car R extends Number
    }


}
