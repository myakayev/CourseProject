package course.myakaev.lesson2;

public class Task5 {
    public static void main(String[] args) {
     int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
     changeNumbers(arr);
     printArray(arr);
    }

    public static void changeNumbers(int x[]) {
        for (int i = 0; i < x.length; i++){
            if (x[i] == 1) {
                x[i] = 0;
            } else {
                x[i] = 1;
            }
        }
    }
    public static void printArray (int x[]) {
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
    }
}
