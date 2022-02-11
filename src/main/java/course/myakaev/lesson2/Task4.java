package course.myakaev.lesson2;

public class Task4 {
    public static void main(String[] args) {
        printString("Test", 3);
    }
    public static void printString(String a, int x){
        for (int i = 0; i < x; i++) {
            System.out.println(a);
        }
    }
}
