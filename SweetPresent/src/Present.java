import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by cs.ucu.edu.ua on 10/10/2016.
 */
public class Present {
    String name;
    int weight = 0;
    int price = 0;
    ArrayList<Sweet> listOfSweets = new ArrayList();

    Present() {}

    Present(String Name) {
        name = Name;
    }

    public void addSweet(Sweet sweet) {
        listOfSweets.add(sweet);
        price += sweet.price;
        weight += sweet.weight;
    }

    public Sweet findSugarContent(int from, int to) {
        for (Sweet s : listOfSweets) {
            if (from <= s.sugar && s.sugar <= to) {
                return s;
            }
        }
        return null;
    }

    public void sortByEnergy() {
        for (int i = 1; i < listOfSweets.size(); i++) {
            boolean bool = true;
            int j = i;

            while(bool && j > 0) {
                if (listOfSweets.get(j - 1).energy > listOfSweets.get(j).energy) {
                    Collections.swap(listOfSweets, j, j - 1);
                    j -= 1;
                } else {bool = false;}
            }
        }
    }
}
