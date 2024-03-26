package ru.gravitana.homework;

import java.util.ArrayList;

public interface View {
    <T> void showEmployeesList(ArrayList<T> employees, String parameter);
    <T> void showEmployeesList(ArrayList<T> employees);
    void showEmployee(Employee employee, String parameter);
    void showEmployee(Employee employee);
}
