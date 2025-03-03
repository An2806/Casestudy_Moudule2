package model;

public class Book extends LibraryItem {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "[SÁCH] " + super.toString();
    }
}
