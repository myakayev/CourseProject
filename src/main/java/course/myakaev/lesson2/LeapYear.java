package course.myakaev.lesson2;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(checkYear(28));
    }
    public static boolean checkYear(int x) {
        if (x % 4 == 0 && x % 100 != 0 || x % 16 == 0 && x % 25 == 0) {
            return true;
        } else
            return false;
    }
}
