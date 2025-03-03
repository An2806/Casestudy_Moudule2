package storage;

import model.Book;
import model.Comic;
import model.LibraryItem;

public class LibraryFactory {
    public static LibraryItem createItem(String type, String name, double price) {
        switch (type.toLowerCase()) {
            case "book":
                return new Book(name, price);
            case "comic":
                return new Comic(name, price);
            default:
                throw new IllegalArgumentException("Loại không hợp lệ! Chỉ chấp nhận 'book' hoặc 'comic'.");
        }
    }
}
