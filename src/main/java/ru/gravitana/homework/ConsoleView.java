package ru.gravitana.homework;

import java.util.ArrayList;

public class ConsoleView implements View{

    @Override
    public <T> void showEmployeesList(ArrayList<T> employees, String parameter) {
        if (employees.isEmpty()) {
            System.out.println("Not found by parameter '" + parameter + "'");
        }
        printEmployeesList(employees);
    }

    @Override
    public <T> void showEmployeesList(ArrayList<T> employees) {
        if (employees.isEmpty()) {
            System.out.println("Not found");
        }
        printEmployeesList(employees);
    }

    @Override
    public void showEmployee(Employee employee, String parameter) {
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Not found by parameter '" + parameter + "'");
        }
   }

    @Override
    public void showEmployee(Employee employee) {
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Not found");
        }
    }

    private <T> void printEmployeesList(ArrayList<T> employees) {
        for (T employee : employees) {
            System.out.println(employee);
        }
    }

}
