package course.myakaev.lesson4;

class Plate {
    private int food;
    Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (n <= food) {
            food -= n;
        }else {
            System.out.println("Мало еды :(");
        }
    }
    int getFood() {
        return food;
    }
    void info() {
        System.out.println("plate: " + food);
    }
    void addFood (int count) {
        food += count;
    }
}

