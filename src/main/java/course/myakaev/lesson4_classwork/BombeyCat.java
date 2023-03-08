package course.myakaev.lesson4_classwork;

public class BombeyCat extends Cat{
    private int c;

    public BombeyCat(int a, int b, int c) {
        super(a, b);	// первым делом вызываем конструктор Cat
        this.c = c;
    }

}
