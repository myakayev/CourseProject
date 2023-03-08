package course.myakaev.lesson4_classwork;

public class Cat extends Animal {
    private int b;
    protected int z;
    public Cat(int a, int z) {
        super(a);    	// первым делом вызываем конструктор Animal
        this.z = z;
        //this.b = b;
    }

    public void test() {
        z = 10;      	// Обращение к полю z класса Cat
        super.z = 20;	// Обращение к полю z класса Animal
    }

}
