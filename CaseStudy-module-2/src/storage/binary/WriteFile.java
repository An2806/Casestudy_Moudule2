package storage.binary;

import model.Menu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile extends IWriteFileMenu {

    public void WriteFile(List<Menu> menus) {
        File file = new File("menu.dat");
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(menus);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
