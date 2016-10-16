/**
 * Created by cs.ucu.edu.ua on 10/16/2016.
 */
import java.util.ArrayList;

public class FlowerShop {
    ArrayList<Bouquete> listOfBouquetes = new ArrayList();

    FlowerShop() {}
    FlowerShop(ArrayList<Bouquete> bouquetes) {
        for (Bouquete b : bouquetes) {
            listOfBouquetes.add(b);
        }
    }
    void addBouquete(Bouquete bouquete) {listOfBouquetes.add(bouquete);
    }

    Bouquete getBest() {
        int maxPrice = 0; // the best is the most expensive
        Bouquete TheBest = null;
        for (Bouquete b : listOfBouquetes) {
            if (b.price > maxPrice) {
                TheBest = b;
                maxPrice = b.price;
            }
        }
        return TheBest;
    }
}
