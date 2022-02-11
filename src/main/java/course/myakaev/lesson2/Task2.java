package course.myakaev.lesson2;

public class Task2 {
    public static void main(String[] args) {
        checkInt (-1);
    }
    public static void checkInt (int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        }else{
            System.out.println("Отрицательное число");
        }
    }
}
