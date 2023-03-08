
package helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileService {

    private static final String FILE_PATH = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\CDhouseprograme\\src\\data\\CD.dat";

    public static void writeFile(Object o) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(FILE_PATH))) {
            objectOutputStream.writeObject(o);
        }
    }

    public static Object readFile() throws IOException,
            ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(FILE_PATH))) {
            return objectInputStream.readObject();
        }
    }
}
