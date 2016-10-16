/**
 * Created by cs.ucu.edu.ua on 10/10/2016.
 */

public class Chocolate extends Sweet {
    String shape;
    String chocolateType; // white, milk, dark
    boolean isStuffed;

    public Chocolate(String name, int weight, int price, int sugar, int energy, String Shape, String ChocolateType, boolean IsStuffed) {
        super(name, weight, price, sugar, energy);
        shape = Shape;
        chocolateType = ChocolateType;
        isStuffed = IsStuffed;
    }
}