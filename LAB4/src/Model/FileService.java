
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 */
public class FileService{

    private static final String FILE_PATH = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\LAB4\\src\\DataStorage\\";

    public static void writeFile(Object o,String fname) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(FILE_PATH+fname))) {
            objectOutputStream.writeObject(o);
        }
    }

    public static Object readFile(String fname) throws IOException,
            ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(FILE_PATH+fname))) {
            return objectInputStream.readObject();
        }
    }
}
