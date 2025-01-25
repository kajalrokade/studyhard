package src.designPatterns.creationalDesignPatterns.Prototype;

import java.util.HashMap;
public class StudentRegistry {
    HashMap<String, Student> students = new HashMap<>();;
    public void register(String key, Student student){
        students.put(key,student);
    }
    public Student get(String key){
        return students.get(key);
    }
}
