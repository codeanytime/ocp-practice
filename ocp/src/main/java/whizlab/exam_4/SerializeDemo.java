package whizlab.exam_4;

import whizlab.exam_4.model.C;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author thanhch
 * <p>
 * Date: 16/11/2023
 * <p>
 * Class: SerializeDemo
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        C c = new C();
        Files.deleteIfExists(Paths.get("test.txt"));
        File file1 = Files.createFile(Paths.get("test.txt")).toFile();
        File file = new File("test.txt");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            out.writeObject(c);
            in.readObject();
        }
        Path path1 = Path.of("1", "2", "3", "..");
        System.out.println(path1.normalize());
    }
}
