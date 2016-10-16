/**
 * Created by cs.ucu.edu.ua on 10/16/2016.
 */
public class Flower {
    String name;
    int price;
    int length;
    boolean isFresh;

    Flower (String n, int p, int l, boolean f) {
        name = n;
        price = p;
        length = l;
        isFresh = f;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Is fresh: " + isFresh);
    }
}