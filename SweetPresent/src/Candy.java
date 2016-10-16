/**
 * Created by cs.ucu.edu.ua on 10/10/2016.
 */

public class Candy extends Sweet {
    String taste; // strawberry, apple, orange..

    Candy(String name, int weight, int price, int sugar, int energy, String Taste) {
        super(name, weight, price, sugar, energy);
        taste = Taste;
    }
}