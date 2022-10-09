package ДЗ_14_Курсовая;

public class Employee {
    private final String fullName;
    private final int salary;
    private static int counter;
    private final int id;
    private final int department;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public String toString() {
        return "id: " + id + " ФИО: " + fullName + " Отдел: №" + department + " Зарплата: " + salary;
    }

    public int getId() {

        return this.id;
    }

    public String getFullName() {

        return this.fullName;
    }

    public int getSalary() {

        return this.salary;
    }

    public int setDepartment(int department) {

        return this.department;
    }

    public int setSalary() {

        return this.salary;
    }
}






