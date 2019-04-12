package ch.hesge.programmation;

public class Generic2<T> {

    private T t;

    //public static class GenericChild<T> extends Generic2<T>{} // 22) compile
    //public static class GenericChild extends Generic2<Number>{} // 23) compile
    public static class GenericChild<V> extends Generic2<Number>{} // 24) compile

    public static void main(String[] args) {
        Generic2<? super Number> g = new Generic2<>();
        g.t = 1;// compile
    }

}
