package products;

public final class Decoration extends Product {
    private final int PRODUCTID=3;

    private Materials material;
    private static int numDecoration;
    {
        numDecoration++;
    }
    public Decoration(String name, double price, Materials material) {
        super(name, price);
        this.material=material;
    }


}
