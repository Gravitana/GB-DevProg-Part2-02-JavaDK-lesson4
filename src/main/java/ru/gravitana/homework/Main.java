package ru.gravitana.homework;

public class Main {
    private static EmployeesList employeesList;

    public static void main(String[] args) {
        employeesList = new EmployeesList();
        View view = new ConsoleView();

        fillList();

        System.out.println("---------------------------------------");
        System.out.println("Весь справочник:\n");
        view.showEmployeesList(employeesList.getAll());

        System.out.println("---------------------------------------");
        System.out.println("Поиск по стажу 2 года:\n");
        view.showEmployeesList(employeesList.getByExperience(2));

        System.out.println("---------------------------------------");
        System.out.println("Поиск имени:");
        view.showEmployeesList(employeesList.getPhoneByName("Иван"));

        System.out.println();
        view.showEmployeesList(employeesList.getPhoneByName("Василий"), "Василий");

        System.out.println();
        view.showEmployeesList(employeesList.getPhoneByName("Тамара"), "Тамара");

        System.out.println("---------------------------------------");
        System.out.println("Поиск по id:");
        view.showEmployee(employeesList.getById(3));
        view.showEmployee(employeesList.getById(30), "30");

    }

    private static void fillList() {
        employeesList.add(new Employee("Иван", "+7 (123) 123-45-67", 2));
        employeesList.add(new Employee("Татьяна", "+7 (456) 234-56-78", 8));
        employeesList.add(new Employee("Игорь", "+7 (789) 123-78-56"));
        employeesList.add(new Employee("Степан"));
        employeesList.add(new Employee("Тамара", "+7 (753) 159-45-87", 5));
        employeesList.add(new Employee("Светлана", "+7 (753) 159-45-87", 2));
        employeesList.add(new Employee("Антон", "+7 (753) 222-45-87", 5));
        employeesList.add(new Employee("Тамара", "+7 (753) 333-45-87", 2));
    }
}
