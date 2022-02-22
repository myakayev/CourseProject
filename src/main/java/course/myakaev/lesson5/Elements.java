package course.myakaev.lesson5;

public class Elements<T> {
    private T[] elements;

    public Elements(T... elements) {
        this.elements = elements;
    }

    public void printElements() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public T[] changeElements(int elemNumber1, int elemNumber2) {
        if (elemNumber1 < elements.length && elemNumber2 < elements.length) {
            T a = null;
            a = elements[elemNumber1];
            elements[elemNumber1] = elements[elemNumber2];
            elements[elemNumber2] = a;
            return elements;
        } else {
            System.out.println("Массив не настолько длинный.");
            return null;
        }
    }
}
