package storage.binary;


import model.Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile extends IReadFileMenu {

    public List<Menu> readFile(String fileName) {
        List<Menu> menuList = new ArrayList<Menu>();
        File file = new File(fileName);
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            List<Menu> menus1 = (List<Menu>) ois.readObject();
            return menus1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
