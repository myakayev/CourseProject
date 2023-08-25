package course.myakaev.lesson4_classwork;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        scanner.close();
        Solution solution = new Solution();
        System.out.println(solution.solution(T));
    }
}
