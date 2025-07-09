package com.kajal.code.DSA.Generics;

public class Pair <A,B>{
    A first;
    B second;

    public void setFirst(A first) {
        this.first = first;
    }
    public void setSecond(B second) {
        this.second = second;
    }
    public A getFirst() {
        return first;
    }
    public B getSecond() {
        return second;
    }

    public static<A,B> void staticMethod(A a,B b){
        System.out.print(" static method :\t");
        System.out.println("first = " + a
                + " second = " + b);
    }
    public void nonStaticMethod(A a, B b) {
        System.out.print("non static method \t" );
        System.out.println("first = " + a
        + " second = " + b);
    }
}

