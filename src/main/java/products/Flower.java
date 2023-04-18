package products;

public class Flower extends Product {
    static int numFlowers;

    private String colour;
    public Flower(String name, double price, int quantity,String colour) {
        super(name, price, quantity);
    }
    public Flower() {

    }

    public String getColour() {
        return colour;
    }
}
