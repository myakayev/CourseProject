package course.myakaev.lesson4;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 1);
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Барбос");
        cat1.run(200);
        dog1.run(500);
        dog1.swim(11);
        cat1.swim(11);
        System.out.println("Количество животных - " + Animal.animalCount);
        System.out.println("Количество котов - " + Cat.catCount);
        System.out.println("Количество собак - " + Dog.dogCount);
        Plate plate1 = new Plate(100);
        plate1.info();
        cat1.eat(plate1);
        plate1.info();
        plate1.addFood(5);
        plate1.info();
        cat1.getInfo();
        Cat[] cats1 = createCats();
        for (Cat icat: cats1) {
            icat.eat(plate1);
            icat.getInfo();
        }
    }
    private static Cat[] createCats() {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Мурзик", 25);
        cat[1] = new Cat("Мурзило", 5);
        cat[2] = new Cat("Мурзище", 100);
        cat[3] = new Cat("Мурзоян", 1);
        cat[4] = new Cat("Мирзук", 2);
        return cat;
    }
}
