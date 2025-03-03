package controller;

import model.Food;
import model.Menu;

import java.util.ArrayList;
import java.util.List;

public class DinerController {
    private List<Menu> menu = new ArrayList<>();


    public DinerController() {
        /// code mẫu
//        Menu a = new Menu(1, "ga", 20);
//        Menu b = new Menu(2, "b", 30);
//        menu.add(a);
//        menu.add(b);
        Menu food1 = new Menu(01, "French fries", 50);
        Menu food2 = new Menu(02, "pizza", 60);
        Menu food3 = new Menu(03, "Hamburger", 55);
        Menu food4 = new Menu(04, "Chicken", 70);
        Menu food5 = new Menu(05, "salad", 80);
        menu.add(food1);
        menu.add(food2);
        menu.add(food3);
        menu.add(food4);
        menu.add(food5);

        Menu drink1 = new Menu(11, "Coca", 10);
        Menu drink2 = new Menu(23, "water", 5);
        Menu drink3 = new Menu(34, "juice", 25);
        Menu drink4 = new Menu(45, "Milo", 15);
        menu.add(drink1);
        menu.add(drink2);
        menu.add(drink3);
        menu.add(drink4);

    }

    public DinerController(List<Menu> menu) {
        this.menu = menu;
    }

    public void addMenu(String name, String size, double price) {
        try {
            int id = 0;
            menu.add(new Menu(id, name, size, price));
            System.out.println("Đã thêm món: " + name);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void displayMenu() {
        if (menu.isEmpty()) {
            System.out.println("Danh sách món ăn trống.");
        } else {
            System.out.println("\n--- DANH SÁCH MÓN ĂN / ĐỒ UỐNG ---");
            for (Menu item : menu) {
                System.out.println(item);
            }
        }
    }

    public void searchMenuByName(String name) {
        boolean found = false;
        for (Menu item : menu) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy món ăn nào có tên: " + name);
        }
    }
    public double calculateTotalRevenue() {
        double total = 0;
        for (Menu item : menu) {
            total += item.getPrice();
        }
        return total;
    }

    public void saveMenuToCSV(String csvFile) {
    }

    public void saveMenuToToBinary(String binaryFile) {

    }
}