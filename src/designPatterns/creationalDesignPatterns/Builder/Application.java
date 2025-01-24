package src.designPatterns.creationalDesignPatterns.Builder;

public class Application {
    public static void main(String[] args) {
        Student s1= Student.builder()
                .name("Kajal")
                .age(26)
                .build();
        System.out.println(s1.getName() + " " + s1.getAge());
        Student s2= Student.builder()
                .name("Kajal R")
                .age(27)
                .build();
        System.out.println(s2.getName() + " " + s2.getAge());
    }
}
