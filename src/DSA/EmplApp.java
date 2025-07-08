package src.DSA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class Employee implements Serializable{

    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

public class EmplApp{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");
        emp.setSalary(2000);
        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Joh");
        emp2.setSalary(4000);
        Employee emp3 = new Employee();
        emp3.setId(3);
        emp3.setName("Jon");
        emp3.setSalary(6000);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp);
        employees.add(emp2);
        employees.add(emp3);

        List<Employee>  filteredResult =employees.stream()
                .filter(employee -> employee.getSalary()>4000)
                .collect(Collectors.toList());

    }
}
