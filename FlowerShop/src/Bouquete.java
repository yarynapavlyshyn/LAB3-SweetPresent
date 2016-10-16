/**
 * Created by cs.ucu.edu.ua on 10/16/2016.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Bouquete {
    ArrayList<Flower> listOfFlowers;
    int price = 0;
    int length = 0; // length of the longest flower
    int size = 0; // number of flowers
    boolean isFresh = true;

    Bouquete() {
        listOfFlowers = new ArrayList<Flower>(3);
    }

    Bouquete(ArrayList<Flower> list_of_flowers) {
        listOfFlowers = list_of_flowers;
        size = list_of_flowers.size();
        int freshFlowers = 0, unfreshFl = 0;
        for (Flower flower: list_of_flowers) {
            price += flower.price;
            if (flower.length > length) {length = flower.length;}

            if (flower.isFresh) {freshFlowers++;}
            else {unfreshFl++;}

            if (freshFlowers < unfreshFl) {isFresh = false;}
        }
    }
    void addFlower(Flower flower) {
        listOfFlowers.add(flower);
        size ++;
        price += flower.price;

        if (flower.length > length) {length = flower.length;}
    }

    Flower findWithLength (int from, int to) {
        for (Flower fl : listOfFlowers) {
            if (from <= fl.length && fl.length <= to) {return fl;}
        }
        System.out.print("There is no suitable flower in the bouquete.");
        return null;
    }
    void sortByFreshness() {
        int freshFl = 0;
        for (int i = 0; i < listOfFlowers.size(); i++) {
            if (listOfFlowers.get(i).isFresh) {
                Collections.swap(listOfFlowers, i, freshFl);
                freshFl++;
            }
        }
    }

    void display() {
        if (isFresh) {System.out.print("FRESH ");}
        else {System.out.print("UNFRESH ");}
        System.out.println("BOUQUETE");
        System.out.println("price: "+ price);
        System.out.println("length: "+ length);
        System.out.print(size +" flowers: ");
        for (Flower f : listOfFlowers) {
            System.out.print(f.name + "("+f.isFresh+")" + ", ");
        }
        System.out.println("(<- if is fresh)");
    }
}
