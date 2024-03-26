package ru.gravitana.homework;

import java.util.ArrayList;

public class EmployeesList {
    private final ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getAll() {
        return employees;
    }
}
