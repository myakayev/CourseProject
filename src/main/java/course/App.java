package course;

import course.lesson3.Employee;

public class App {
    public static void main(String[] args) {
        Employee[] employees = createEmployees();
        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.info();
            }
        }
    }

    private static Employee[] createEmployees() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Валерий Пятихаткин", "Помощник конюха",
                "emaila@tochno.net", "000", 6500, 25);
        employees[1] = new Employee("Гриша Шестихаткин", "Помощник конюха1",
                "emaila@tochno.da", "001", 6500, 78);
        employees[2] = new Employee("Анаколий Семихаткин", "Помощник конюха2",
                "emaila@tochno.hz", "002", -1, 13);
        employees[3] = new Employee("Иоан Восьмихаткин", "Помощник конюха3",
                "emaila@tochno.na", "003", 6500, 51);
        employees[4] = new Employee("Колыван Косарин", "Старший помощник конюха",
                "emaila@tochno.byl", "007", 6501, 999);

        return employees;
    }
}
