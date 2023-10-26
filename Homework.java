package ru.gb.lesson3.hw;
import java.util.ArrayList;
import java.util.*;

public class Homework {
    public static class Main {
        public static void main(String[] args) {
            List<Employee> employees = listEmployees();
            System.out.println(employees);
            employees.sort(Employee::compareTo);
            System.out.println(employees);

            employees.sort(new DepartmentComparator());
            System.out.println(employees);


            employees.sort(new SalaryComparator());
            System.out.println(employees);

        }

        private static List<Employee> listEmployees() {
            List<Employee> result = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                Employee employee = new Employee(
                        "Employee " + i,
                        20 + i,
                        1000 + i * 10,
                        "Department " + i);
                result.add(employee);
            }
            return result;
        }
    }

}


