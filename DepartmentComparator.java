package ru.gb.lesson3.hw;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getDepartment().compareTo(o1.getDepartment());
    }
}

