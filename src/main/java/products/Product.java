package products;

import java.util.Objects;

public sealed abstract class Product permits  Flower, Decoration, Tree{
    protected String name;
    protected double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return " | Product name: "+this.name+" | Product price: "+this.price;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Product product)) {
            return false;
        }
        else if (this.name.equals(product.name)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}