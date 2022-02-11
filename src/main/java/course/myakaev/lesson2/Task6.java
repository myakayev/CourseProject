package course.myakaev.lesson2;

public class Task6 {
    public static void main(String[] args) {
     int x [] = new int[10];
     fillArray(x);
     //printArray(x);
    }
    public static void fillArray(int x[]) {
        for (int i = 0; i < x.length; i++){
            x[i] = i+1;
        }
    }
    public static void printArray (int x[]) {
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
    }
}
