package com.kajal.code.designPatterns.creationalDesignPatterns.Prototype;



public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String gender;
    private String course;
    private String batch;
    private String instructor;
    private double avgBatchPsp;
    private String moduleName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    Student(){

    }
     Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.gender = student.gender;
        this.course = student.course;
        this.batch = student.batch;
        this.instructor = student.instructor;
        this.avgBatchPsp = student.avgBatchPsp;
        this.moduleName = student.moduleName;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
