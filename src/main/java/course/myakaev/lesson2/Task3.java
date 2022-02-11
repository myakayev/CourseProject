package course.myakaev.lesson2;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(checkIntBool(-1));
    }
    public static boolean checkIntBool(int x) {
        if (x >= 0) {
            return true;
        }else{
            return false;
        }
    }
}
