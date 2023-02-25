package course.myakaev;
import java.util.Scanner;
public class Scanner123 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in); //Создали объект Scanner
//        System.out.print("Input a number: "); //Попросили у пользователя ввести число
//        int num = in.nextInt(); //Прочитали число
//        System.out.println("Your number is " + num); //Вывели число
//        in.close(); //Закрыли объект scanner - последняя операция
        int[][] arr = {{2,4,6,8}, {5,6,7,8}, {0,9,8,7,6}};
        print2DArray(arr);
    }


    public static void print2DArray(int[][] arr) {
        for (int i = 0; i <= arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
