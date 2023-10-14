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
 * Class: CleanResource
 */
public class CleanResource {
    public static void clear(String sourceFolder, String extension){
        Path path = Paths.get(sourceFolder);
        if (path.toFile().isDirectory()) {
            try (Stream<Path> inputStream = Files.walk(path)) {
                inputStream.forEach((p) -> {
                    if (p.toString().endsWith(extension)) {
                        p.toFile().delete();
                    }
                });
            } catch (IOException e) {
                System.err.println("ERROR WHEN CLEAR");
            }
        } else {
            return;
        }
    }
}
