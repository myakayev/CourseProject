package course.myakaev.lesson4;

class Dog extends Animal {
    static int dogCount;
    Dog(String name) {
        super(name);
        dogCount++;
    }
    @Override
    void swim (int x){
        if (x > 10) {
            System.out.println("Собаки так далеко не заплыввают!");
        } else {
            super.swim(x);
        }
    }
    @Override
    void run (int x){
        if (x > 500) {
            System.out.println("Собаки так далеко не бегают!");
        }
        else {
            super.run(x);
        }
    }

}
