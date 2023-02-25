package course.myakaev.lesson2;
public class ThreeStars {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        elementShift(x,2);
        Task9.printArray(x);
    }

    public static void elementShift (int x[], int n){
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    int buf;
                    int k = 1;
                    for (int j = 0; j < x.length - 1; j++, k++) {
                        buf = x[0];
                        x[0] = x[k];
                        x[k] = buf;
                    }
                }
            } else {
                for (int i = 0; i < n * (-1); i++) {
                    int buf;
                    int k = x.length - 2;
                    for (int j = x.length - 1; j > 0; j--, k--) {
                        buf = x[x.length - 1];
                        x[x.length - 1] = x[k];
                        x[k] = buf;
                    }
                }
            }
    }
}
