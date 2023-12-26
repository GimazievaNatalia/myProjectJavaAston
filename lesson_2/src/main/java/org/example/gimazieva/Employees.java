package org.example.gimazieva;

public class Employees {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employees(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void showEmployeeInformation() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; email: " + email +
                "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}




