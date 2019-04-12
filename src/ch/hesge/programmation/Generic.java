package ch.hesge.programmation;

public class Generic<T> { //9) compile

    private final T t;

    public Generic(T t){
        this.t = t;
    } //10) compile

    public static void main(String[] args) {
        //Generic g = new Generic(new Object()); //11) compile car T peut être n'importe quoi
        //Generic g = new Generic<>(new Object()); //compile
        //Generic<?> g = new Generic<>(new Object()); //compile

        //Generic<?> g = new Generic<>(new Object());
        //? t = g.t; // 14) compile pas
        //Object t = g.t; // 15) compile

        //Generic<Object> g = new Generic<>(new Object());
        //Object t = g.t; // 16) compile

        //Generic<? extends Number> g = new Generic<>(1);
        //Object t = g.t; // 17) compile car tout ce qui extend Number est un objet
        //Number t = g.t; // 18) compile
        //Integer t = g.t; // 19) compile pas car t extends de number mais on sait pas quoi
        //System.out.println(t);

        //Generic<? super Number> g = new Generic<>(1);
        //Number t = g.t; // 20) compile pas car g.t peut etre n'importe quoi

    }
}
