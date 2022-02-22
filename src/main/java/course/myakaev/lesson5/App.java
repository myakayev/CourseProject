package course.myakaev.lesson5;

public class App {
    public static void main(String[] args) {
        Elements<Double> testArray = new Elements<>(2.0, 1.0, 5.0, -1.0);
        testArray.printElements();
        testArray.changeElements(2,4);
        testArray.printElements();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Box box1 = new Box(apple1);
        Box box4 = new Box(apple1);
        Box box2 = new Box(orange2);
        Box box3 = new Box(orange2);
        box1.addFruitInBox(orange2);
        box1.infoBoxSize();

    }
}
