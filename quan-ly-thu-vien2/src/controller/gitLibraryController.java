package controller;

import model.LibraryItem;
import storage.LibraryFactory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class gitLibraryController {
    private List<LibraryItem> items;
    private Calendar fileManager;
    private final ExecutorService executor = Executors.newCachedThreadPool();

    public void gitLibraryController() {
        this.items = new ArrayList<>();
        Calendar FileManager = null;
        this.fileManager = FileManager.getInstance();
    }

    public void addItem(String type, String name, double price) {
        try {
            LibraryFactory LibraryFactory = null;
            LibraryItem item = LibraryFactory.createItem(type, name, price);
            items.add(item);
            System.out.println("Đã thêm: " + name);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
