package products;

public final class Decoration extends Product {
    private final int PRODUCTID=3;

    public Decoration() {

    }

    private Materials material;
    private String s ="hola que tal";
    private static int numDecoration;
    {
        numDecoration++;
    }
    public Decoration(String name, double price, int quantity, Materials material) {
        super(name, price, quantity);
        this.material=material;
    }

    public Materials getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Product id: "+this.PRODUCTID+" | "+super.toString()+" | Product type: "+this.material;
    }
}
