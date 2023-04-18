package products;

public class    Flower extends Product {

    //ivan
    String colour;
    static int numFlowers;

    public Flower(String name, double price, String colour) {
        super(name, price);
        this.colour = colour;
    }
}
