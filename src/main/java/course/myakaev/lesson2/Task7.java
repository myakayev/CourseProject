package course.myakaev.lesson2;

public class Task7 {
    public static void main(String[] args) {
        int x[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        multipleNumbers(x);
        printArray(x);
    }
    public static void multipleNumbers(int x[]) {
        for (int i = 0; i < x.length; i++){
            if (x[i] < 6) {
                x[i] *= 2;
            }
        }
    }
    public static void printArray (int x[]) {
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
    }
}
