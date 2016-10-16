/**
 * Created by cs.ucu.edu.ua on 10/10/2016.
 */

public class Biscuit extends Sweet {
    boolean isSoft;
    boolean isStuffed;

    Biscuit(String name, int weight, int price, int sugar, int energy, boolean IsSoft, boolean IsStuffed) {
        super(name, weight, price, sugar, energy);
        isSoft = IsSoft;
        isStuffed = IsStuffed;
    }
}
