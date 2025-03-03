package method;

import model.LibraryItem;

import java.io.*;
import java.util.List;

public final class FileManager {
    private static final FileManager instance = new FileManager();

    private FileManager() {} // Đảm bảo không thể tạo instance bên ngoài

    public static FileManager getInstance() {
        return instance;
    }

    public void saveToCSV(List<LibraryItem> items, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (LibraryItem item : items) {
                writer.println(item.getName() + "," + item.getPrice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveToBinary(List<LibraryItem> items, String fileName) throws FileNotFoundException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(items);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
