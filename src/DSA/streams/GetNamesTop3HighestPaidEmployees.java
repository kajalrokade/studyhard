package src.DSA.streams;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetNamesTop3HighestPaidEmployees {
    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();
        Employees employee = new Employees("Kajal", 100000L);
        Employees employees1 = new Employees("Abhijeet", 20000L);

        Employees employee2 = new Employees("Snehal", 50000L);

        Employees employee3 = new Employees("Tejal", 1201222L);

        Employees employee4 = new Employees("Pagal", 8377373L);

        Employees employee5 = new Employees("Sejal", 552525L);

        List<Employees> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employees1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        employeeList.add(employee5);

        List<Employees> collect = employeeList.stream()
                .sorted(Comparator.comparingLong(Employees::getSalary).reversed())
                .limit(3).collect(Collectors.toList());

        for (Employees emp : collect) {
            System.out.println(emp.getName() +" : "+emp.getSalary());
        }

    }
}

@Getter
class Employees {
    String name;
    Long salary;

    public Employees(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }
}