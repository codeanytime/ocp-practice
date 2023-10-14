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
public final class ResourceManage {
    public static String FOLDER_TMP = "ocp/src/main/java/javaNIO2/copyFolder";
    public static String FOLDER_LINK = "ocp/src/main/java/javaNIO2/copyFolder/link";

    public static Path createSymbolicLink(Path sourceFilePath, String linkName) throws IOException {
        if (!Paths.get(FOLDER_LINK).toFile().exists()) {
            Files.createDirectory(Paths.get(FOLDER_LINK));
        }
        Path link = Paths.get(FOLDER_LINK).resolve(linkName);
        return Files.createSymbolicLink(link, sourceFilePath);
    }

    public static Path createLink(Path sourceFilePath, String linkName) throws IOException {
        if (!Paths.get(FOLDER_LINK).toFile().exists()) {
            Files.createDirectory(Paths.get(FOLDER_LINK));
        }
        Path link = Paths.get(FOLDER_LINK).resolve(linkName);
        return Files.createLink(link, sourceFilePath);
    }

    public static void clearSymbolicLink(String linkName) throws IOException {
        Path link = Paths.get(FOLDER_LINK).resolve(linkName);
        if (Files.isSymbolicLink(link)) {
            Files.deleteIfExists(link);
        }
    }

    public static void clearLink(String linkName) throws IOException {
        Files.deleteIfExists(Paths.get(FOLDER_LINK).resolve(linkName));
    }

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
