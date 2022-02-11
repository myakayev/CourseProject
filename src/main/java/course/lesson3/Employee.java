package course.lesson3;

public class Employee {
    final private String fullName, position, email, tel;
    final private int salary;
    public final int age;

    public Employee(String fullName, String position, String email, String tel, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("ФИО - " + fullName);
        System.out.println("Должность - " + position);
        System.out.println("email - " + email);
        System.out.println("Телефон - " + tel);
        System.out.println("Зарплата - " + salary);
        System.out.println("Возраст - " + age);
        System.out.println("---------------------");
    }

}
