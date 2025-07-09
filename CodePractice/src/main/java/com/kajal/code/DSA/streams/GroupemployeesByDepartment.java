package com.kajal.code.DSA.streams;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupemployeesByDepartment {
    public static void main(String[] args) {
        Employee employees = new Employee("Kajal","Engineering");
        Employee employees1 = new Employee("Abhijeet","Engineering");

        Employee employee2 = new Employee("Snehal","HR");

        Employee employee3 = new Employee("Tejal","HR");

        Employee employee4 = new Employee("Pagal","Accounts");

        Employee employee5 = new Employee("Sejal","Engineering");

        List<Employee> employeeList = new ArrayList<>();
            employeeList.add(employees);
            employeeList.add(employees1);
            employeeList.add(employee2);
            employeeList.add(employee3);
            employeeList.add(employee4);

            employeeList.add(employee5);

        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        for (Map.Entry<String, List<Employee>> entry : collect.entrySet()) {
            System.out.print(entry.getKey() +": ") ;
            for (Employee employee : entry.getValue()) {
                System.out.print(employee.getName() +" ");
            }
            System.out.println();
        }
    }
}
@Getter

class Employee {
    String name;
    String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}