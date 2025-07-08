package practice.src.DSA.Generics;


public class Client {
    public static void main(String[] args) {
        Pair p1= new Pair();
        p1.first= "ABC";
        p1.second= 99876;
        System.out.println("First: "+p1.first);
        System.out.println("Second: "+p1.second);
        Pair p2 = new Pair();
        p2.nonStaticMethod(19,20);
        Pair.staticMethod(25,24);

    }
}
