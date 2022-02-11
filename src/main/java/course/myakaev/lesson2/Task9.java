package course.myakaev.lesson2;

public class Task9 {
    public static void main(String[] args) {
       printArray(createArray(5, 8));
    }
    public static int[] createArray(int len, int initValue) {
        int[] x = new int[len];
        for (int i = 0; i < len; i++) {
            x[i] = initValue;
        }
        return x;
    }
    public static void printArray (int x[]) {
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
    }
}
