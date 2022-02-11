package course.myakaev.lesson2;

public class Task8 {
    public static void main(String[] args) {
        int x = 6;
        int arr[][] = new int[x][x];
        changeArray(arr);
        printArray(arr);
    }
    public static void changeArray(int x[][]) {
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                if (i == j){
                    x[i][j] = 1;
                    x[i][x.length-1-i] = 1;
                }
            }
        }
    }
    public static void printArray (int x[][]) {
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++)
            System.out.print(x[i][j] + " ");
            System.out.println();
        }
    }
}
