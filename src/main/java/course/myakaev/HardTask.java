package course.myakaev;

public class HardTask {
    public static void main(String[] args) {
        int horizontal = 6, vertical = 12;
        drawSomethingSpecial(horizontal, vertical);
    }

    public static void drawSomethingSpecial(int horizontal, int vertical) {
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                if (i % 2 == 1) {
                    if (j == 0) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                } else if (j == 0) {
                    System.out.print(" ");
                } else if (i == 0 || i == vertical-2)
                    System.out.print("* ");
                else if (j == 1 || j == (i-j+2))
                    System.out.print("* ");
                   else System.out.print(" ");
            }
            System.out.println();
        }
    }
}