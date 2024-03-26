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

    public ArrayList<Employee> getByExperience(int experience) {
        ArrayList<Employee> found = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                found.add(employee);
            }
        }
        return found;
    }

    public ArrayList<String> getPhoneByName(String name) {
        ArrayList<String> found = new ArrayList<>();
        for (Employee employee : employees) {
            if (name.equals(employee.getName())) {
                found.add("id:" + employee.getId() + ". " + employee.getName() + ": " + employee.getPhoneNumber());
            }
        }
        return found;
    }

    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
