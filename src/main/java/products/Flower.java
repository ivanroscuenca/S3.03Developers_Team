package products;

public final class Flower extends Product {
    private final int PRODUCTID=2;

    private String colour;
    private int quantity;
    private static int numFlowers;



    {
        numFlowers+=quantity;
    }
    public Flower(String name, double price, String colour) {
        super(name, price);
        this.colour=colour;
    }

    @Override
    public String toString() {
        return "Product id: "+this.PRODUCTID+" | "+super.toString()+" | Product colour: "+this.colour;
    }
}
