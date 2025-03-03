package storage.csv;

import model.Menu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCSV {

    public static final String NEW_LINE = "\n";
    public static final String SEPARATOR = ",";
    public static final String FILE_HEADER = "id,name,soluong,size,price";

    public static void writeToFile(String fileName, List<Menu> menus) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
            fw.append(FILE_HEADER + NEW_LINE);
            for (Menu menu : menus) {
                fw.append(menu.getId() + SEPARATOR + menu.getId() + SEPARATOR + menu.getName() + NEW_LINE);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}