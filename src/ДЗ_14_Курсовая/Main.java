package ДЗ_14_Курсовая;

public class Main {
    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Петров Петр Петрович ", 1, 280000);
        employee[1] = new Employee("Иванов Иван Иванович", 2, 325500);
        employee[2] = new Employee("Семенов Семен Семенович", 3, 310000);
        employee[3] = new Employee("Павлов Павел Павлович", 4, 295000);
        employee[4] = new Employee("Александров Александр Александрович", 5, 260000);
        for (Employee employee : employee) {
            System.out.println(employee);
        }
        System.out.println("Сумма затрат на зарплаты сотрудников составляет: " + (employee[0].getSalary()
                + employee[1].getSalary() + employee[2].getSalary() + employee[3].getSalary()
                + employee[4].getSalary()) + " рублей!");
        System.out.println("Минимальная зарплата сотрудника " + getMinSalary() + " рублей!");
        System.out.println("Максимальная зарплата сотрудника " + getMaxSalary() + " рублей!");
        int average = (getMaxSalary().getSalary() - getMinSalary().getSalary() / employee.length);
        System.out.println("Среднее значение зарплат " + average + " рублей!");
    }

    public static Employee getMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee MaxEmployee = null;
        for (Employee a : employee) {
            if (a != null && a.getSalary() > max) {
                max = a.getSalary();
                MaxEmployee = a;
            }
        }
        return MaxEmployee;
    }

    public static Employee getMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee MinEmployee = null;
        for (Employee b : employee) {
            if (b != null && b.getSalary() < min) {
                min = b.getSalary();
                MinEmployee = b;
            }
        }
        return MinEmployee;
    }
}


