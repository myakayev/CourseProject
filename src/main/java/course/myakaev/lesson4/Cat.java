package course.myakaev.lesson4;

import java.sql.SQLOutput;

class Cat extends Animal {
    static int catCount;
    private int appetite;
    private boolean satiety = false;
    Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        catCount ++;
    }
    void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            ; //System.out.println("Аппетит кота слишком велик для данной тарелки!");
        }
    }
    void getInfo () {
        if (satiety) {
            System.out.println(name + " насытился.");
        }else {
            System.out.println(name + " остался голодным.");
        }
    }

    @Override
    void swim (int x){
        System.out.println("Коты не умеет плавать!");
    }
    @Override
    void run (int x){
        if (x > 200) {
            System.out.println("Коты так далеко не бегают!");
        }
        else {
            super.run(x);
        }
    }

}
