package org.example.gimazieva;


public class Employees {
    public String name, position, email, phone, salary, age;

    public Employees(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void showEmployeeInformation() {
        Employees[] emploerArray = new Employees[5];
        emploerArray[0] = new Employees("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        emploerArray[1] = new Employees("Loshkin Pavel", "Engineer", "pashalo@mail.ru", "89166154123", 30000, 32);
        emploerArray[2] = new Employees("Koshkin Kir", "Director", "kirdir@mail.ru", "894551552365", 150000, 35);
        emploerArray[3] = new Employees("Gorbunova Maria", "Booker", "prostomaria@mailbox.ru", "89157158169", 40000, 30);
        emploerArray[4] = new Employees("ProhorovStepan", "Engineer", "stepankaftan@mail.ru", "87456122365", 30000, 40);
        System.out.println(emploerArray[]);
    }

    public static void main(String[] args) {
        showEmployeeInformation();
    }
}


//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//
//Создать массив из 5 сотрудников.
//Пример:
//// вначале объявляем массив объектов
//Person[] persArray = new Person[5];
//// потом для каждой ячейки массива задаем объект
//persArray[0] = new Person("Ivanov Ivan", "Engineer",
//               "ivivan@mailbox.com", "892312312", 30000, 30);
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//
//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.