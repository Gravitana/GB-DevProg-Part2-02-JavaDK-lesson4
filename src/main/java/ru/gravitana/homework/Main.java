package ru.gravitana.homework;

public class Main {
    public static void main(String[] args) {
        EmployeesList employeesList = new EmployeesList();

        employeesList.add(new Employee("Иван", "+7 (123) 123-45-67", 2));
        employeesList.add(new Employee("Татьяна", "+7 (456) 234-56-78", 8));
        employeesList.add(new Employee("Игорь", "+7 (789) 123-78-56"));
        employeesList.add(new Employee("Степан"));
        employeesList.add(new Employee("Тамара", "+7 (753) 159-45-87", 5));
        employeesList.add(new Employee("Светлана", "+7 (753) 159-45-87", 2));
        employeesList.add(new Employee("Антон", "+7 (753) 222-45-87", 5));
        employeesList.add(new Employee("Тамара", "+7 (753) 333-45-87", 2));

        for (Employee employee : employeesList.getAll()) {
            System.out.println(employee);
        }
    }
}
