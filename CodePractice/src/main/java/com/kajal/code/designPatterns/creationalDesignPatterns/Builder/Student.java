package com.kajal.code.designPatterns.creationalDesignPatterns.Builder;

/**
 * It allows you to create different types of objects using the same construction process.
 * It separates the construction of an object from its representation,
 * allowing you to create different types of objects with the same construction steps.
 *
 * Implemented the builder design pattern to create the Student object
 * created a Student Class inside Student builder() method which will be responsible to provide the Builder class object
 * from that object we can make the Student object.
 * inside the Builder class build() method is responsible to create a Student class object with the provided parameter.
 */

/**
 * author : Kajal Rokade
 */
public class Student {
    private String name;
    private int age;

    public static Builder builder(){
        return new Builder();
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;

    }

    public static  class Builder {
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }
}
