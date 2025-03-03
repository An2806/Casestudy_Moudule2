package storage.csv;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CsvReaderExample {
    public static List<Menu> readCsvFile (String fileName) {
        List<Menu> menu = new ArrayList<Menu>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            List<String> lines = new ArrayList<>();
            String line;
            While ((line = br.readLine()) != null);
            {
                lines.add(line);
                System.out.println(line);
            }
            Object menus = getMenu(lines);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return menu;
    }

    private static void While(boolean b) {
    }

    private static List<Menu> getMenu (List<String> strings) {
        List<Menu> menus = new ArrayList<>();
        LinkedList<Menu> menus1 = new LinkedList<>();
        strings.remove(0);
        for (String m : strings) {
//            Object WriteFileCSV;
            String[] split = m.split(WriteFileCSV.SEPARATOR);
            int id = Integer.parseInt(split[0]);
            String name = split[1];
            String price= split[2];
            Menu menu = new Menu();
            menus.add(menu);
        }
        return menus;
    }
}
