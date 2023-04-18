package products;
// emmanuel
public class Product {
    protected String name;
    protected double price;
    protected int quantity;


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product :" +
                ", name='" + name + '\'' +
                ", price=" + price +'\'' +
                ", quantity=" + quantity +'.';
    }
}