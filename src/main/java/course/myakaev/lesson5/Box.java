package course.myakaev.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Box <T extends Fruit>  {
    List<T> list = new ArrayList<>();
    public  Box (T fruit) {
        list.add(fruit);
    }

    public void infoBoxSize () {
        System.out.println(list.size());
    }

  public void addFruitInBox(T fruitAdd) {

      if (list.get(0).getClass().getName().equals(fruitAdd.getClass().getName())) {
          list.add(fruitAdd);
          } else {
          System.out.println("Не твой фрукт, братан!");
      }

    }
    public float getWeight(){
        float sum = 0.0f;
        for (T fruit:list) {
            sum += fruit.weight;
        }
        return sum;
    }
    public boolean compare(Box box){
        return getWeight()== box.getWeight();
    }

}
