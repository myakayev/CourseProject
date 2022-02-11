package course.myakaev.lesson2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(checkSum(10,3));
    }
    public static boolean checkSum(int x, int y){
        if ( (x + y) >= 10 && (x + y) <= 20 ) {
            return true;
        } else {
            return false;
        }
    }
}
