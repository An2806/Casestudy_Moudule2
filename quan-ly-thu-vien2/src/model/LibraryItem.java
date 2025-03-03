package model;

import java.io.Serializable;

public abstract class LibraryItem implements Serializable {
    protected String name;
    protected double price;

    public LibraryItem(String name, double price) {
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
        return "Tên: " + name + ", Giá: " + price + " VNĐ";
    }
}
