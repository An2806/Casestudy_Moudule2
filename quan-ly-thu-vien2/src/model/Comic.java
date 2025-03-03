package model;

public class Comic extends LibraryItem {
    public Comic(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "[TRUYỆN TRANH] " + super.toString();
    }
}
