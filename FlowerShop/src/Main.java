/**
 * Created by cs.ucu.edu.ua on 10/16/2016.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public Main(){}
    public static void main(String[] args) {
        Flower f1 = new Flower("f1", 20, 45, true);
        Flower f2 = new Flower("f2", 10, 50, false);
        Flower f3 = new Flower("f3", 15, 35, true);
        Flower f4 = new Flower("f4", 25, 40, true);
        Flower f5 = new Flower("f5", 18, 30, false);
        System.out.println("Flower " + f1.name + " costs " + f1.price + ".");
        System.out.println("That is " + f5.isFresh + " that flower " + f1.name + " with length " + f5.length + " is fresh.");

        Bouquete b1 = new Bouquete();
        b1.addFlower(f1);
        b1.addFlower(f2);
        b1.addFlower(f3);
        b1.addFlower(f4);
        b1.addFlower(f5);
        ArrayList<Flower> list = new ArrayList(Arrays.asList(new Flower[]{f1, f2, f5}));
        Bouquete b2 = new Bouquete(list);

        System.out.println();
        b2.display();
        System.out.println();
        b1.display();
        b1.sortByFreshness();
        System.out.println();

        System.out.println("Previous bouquete after sorting by freshness.");
        System.out.println();

        b1.display();

        FlowerShop shop = new FlowerShop();
        shop.addBouquete(b1);
        shop.addBouquete(b2);
        System.out.println();
        System.out.println("The best bouquete in the shop: ");
        shop.getBest().display();
    }
}
