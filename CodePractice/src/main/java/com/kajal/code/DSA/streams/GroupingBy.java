package com.kajal.code.DSA.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<String> names = List.of("Kajal", "Komal", "Ravi", "Kiran", "Amit", "Ramesh");

        Map<Character, List<String>> grouped =
                names.stream()
                        .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(grouped);


        List<Employee> employees = List.of(
                new Employee("Kajal", "HR"),
                new Employee("Ravi", "Tech"),
                new Employee("Komal", "HR"),
                new Employee("Amit", "Finance"),
                new Employee("Ramesh", "Tech")
        );

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for (Map.Entry<String, List<Employee>> entry : collect.entrySet()) {
            System.out.print(entry.getKey() + "= ");
            for (Employee employee : entry.getValue()) {
                System.out.print(employee.getName()+" ");
            }
            System.out.println();
        }
    }
}
