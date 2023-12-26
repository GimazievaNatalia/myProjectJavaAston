package org.example.gimazieva;

public class App {
    public static void main(String[] args) {
        // Создание массива сотрудников
        Employees[] employeeArray = new Employees[5];
        employeeArray[0] = new Employees("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employees("Loshkin Pavel", "Engineer", "pashalo@mail.ru", "89166154123", 30000, 32);
        employeeArray[2] = new Employees("Koshkin Kir", "Director", "kirdir@mail.ru", "894551552365", 150000, 35);
        employeeArray[3] = new Employees("Gorbunova Maria", "Booker", "prostomaria@mailbox.ru", "89157158169", 40000, 30);
        employeeArray[4] = new Employees("Prohorov Stepan", "Engineer", "stepankaftan@mail.ru", "87456122365", 30000, 40);

        // Вывод информации о сотрудниках
        for (Employees employee : employeeArray) {
            employee.showEmployeeInformation();
        }

    }
}
