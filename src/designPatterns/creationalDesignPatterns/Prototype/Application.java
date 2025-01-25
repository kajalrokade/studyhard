package src.designPatterns.creationalDesignPatterns.Prototype;


public class Application {

    private static void fillRegistry(StudentRegistry registry) {
        Student student= new Student();
        student.setCourse("Academy");
        student.setBatch("Beginer Evening");
        student.setInstructor("Umang");
        student.setAvgBatchPsp(40);
        student.setModuleName("LLD ");

        registry.register("student",student);


        IntelligentStudent intelligentStudent =  new IntelligentStudent();
        intelligentStudent.setIq(10);
        intelligentStudent.setIntelligenceScore(90);

        registry.register("intelligentStudent",intelligentStudent);

    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student john = registry.get("student").clone();
        john.setName("John Doe");
        john.setAge(18);

        System.out.println(john.getName() + " " + john.getAge() +" "+john.getBatch() + " " +
        "" + john.getInstructor() + " " + john.getAvgBatchPsp() );
    }

}
