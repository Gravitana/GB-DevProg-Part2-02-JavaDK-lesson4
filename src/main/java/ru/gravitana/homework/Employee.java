package ru.gravitana.homework;

public class Employee {
    private static int lastId = 0;
    private int id;
    private String name;
    private String phoneNumber;
    private int experience;

    public Employee(String name, String phoneNumber, int experience) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        ++lastId;
        this.id = lastId;
    }

    public Employee(String name, String phoneNumber) {
        this(name, phoneNumber, 0);
    }

    public Employee(String name) {
        this(name, "", 0);
    }

    @Override
    public String toString() {
        return name +
                ": id='" + id + '\'' +
                ", phone='" + phoneNumber + '\'' +
                ", experience='" + experience + '\''
                ;
    }
}
