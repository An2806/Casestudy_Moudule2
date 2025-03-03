package storage.factory;

import model.Drink;
import model.Food;
import model.Menu;

public class MenuFactory {
    private static MenuFactory instance;

    private MenuFactory() {}

    public synchronized static MenuFactory getInstance() {
        if (instance == null) {
            instance = new MenuFactory();
        }
        return instance;
    }

    public Menu createMenu(String id) {
        switch (id) {
            case "Food":
                return new Food();
            case "Drink":
                return new Drink();
            default:
                throw new IllegalArgumentException("Invalid menu id");
        }
    }
}