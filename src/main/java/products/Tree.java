package products;

public final class Tree extends Product{
    private final int PRODUCTID=1;
    private double height;
    private static int numTrees;
    {
        numTrees++;
    }
    public Tree(String name, double price, double height) {
        super(name, price);
        this.height=height;
    }

    @Override
    public String toString() {

        return "Product id: "+this.PRODUCTID+" | "+super.toString()+" | Product height: "+this.height;
    }
}
