/**
 * Created by cs.ucu.edu.ua on 10/10/2016.
 */


public class Main {
    public Main() {}

    public static void main(String[] args) {
        Candy lemonchyk = new Candy("Lemonchyk", 12, 2, 10, 40, "lemon");
        Chocolate olenka = new Chocolate("Olenka", 100, 25, 50, 500, "Rectangle", "Milk", false);
        Biscuit artemon = new Biscuit("Artemon", 23, 8, 6, 210, false, true);
        Candy mak = new Candy("Mak", 67, 11, 36, 309, "cinnamon");
        Present present = new Present();
        present.addSweet(lemonchyk);
        present.addSweet(olenka);
        present.addSweet(artemon);
        present.addSweet(mak);
        System.out.println("PRESENT:");
        System.out.println();
        for (Sweet s : present.listOfSweets) {
            System.out.println(s.name + " ("+ s.energy +" cal)");
        }
        System.out.println();
        System.out.println("weight: " + present.weight);
        System.out.println("price: " + present.price);
        System.out.println("sweets from 10 to 100 grams of sugar: "+ present.findSugarContent(10, 100));
        System.out.println("Before sorting by energy value : ");

        for (Sweet s : present.listOfSweets) {
            System.out.println(s.name + " (" + s.energy + " cal)");
        }

        present.sortByEnergy();
        System.out.println();

        System.out.println("After sorting by energy value: ");
        for (Sweet s : present.listOfSweets) {
            System.out.println(s.name + " (" + s.energy + " cal)");
        }

    }
}
