package javaNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 14/10/2023
 * <p>
 * Class: NIO2Method
 */
public class NIO2Method {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("ocp/src/main/java/javaNIO2/NIO2.md");
        Path copy = Paths.get("ocp/src/main/java/javaNIO2/COPY_NIO2.md");
        if (Files.deleteIfExists(copy)) {
            System.out.println("FILE COPY_NIO2.md EXISTED, REMOVE OLD DATA AND COPY AGAIN!");
        }
        Files.copy(source, copy);
        Path folderPath = Paths.get("ocp/src/main/java/javaNIO2/copyFolder");
        if (Files.exists(folderPath)) {
            if (folderPath.toFile().isDirectory()) {
                System.out.println("Folder existed");
            } else {
                Files.createDirectory(folderPath);
            }
        }
        System.out.println("BEFORE MOVE: " + copy.toAbsolutePath().getParent());
        Files.deleteIfExists(folderPath.resolve("COPY_NIO2.md"));
        Files.move(copy, folderPath.resolve("COPY_NIO2.md"));
        try (Stream<Path> input = Files.walk(folderPath)) {
            input.forEach(path -> {
                if (path.toFile().isFile())
                    System.out.println("AFTER MOVE: " + path.toAbsolutePath().getParent());
            });
        }
    }
}
