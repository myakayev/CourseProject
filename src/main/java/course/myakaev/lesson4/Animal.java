package course.myakaev.lesson4;
class Animal {
    String name;
    static int animalCount;
    Animal(String name) {
        this.name = name;
        animalCount ++;
    }

    void run (int x){
        System.out.println(name + " пробежал " + x + " метров.");
    }
    void swim (int x){
        System.out.println(name + " проплыл " + x + " метров.");
    }
}
