package javaNIO2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.UserPrincipal;
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
                if (path.toFile().isFile()) {
                    System.out.println("AFTER MOVE: " + path.toAbsolutePath().getParent());
                    try {
                        System.out.println("OWNER: " + Files.getOwner(path));
                        FileSystem fileSystem = path.getFileSystem();
                        System.out.println(fileSystem);
                        UserPrincipal owner = path.getFileSystem()
                                .getUserPrincipalLookupService().lookupPrincipalByName("thanhch");
                        Files.setOwner(path, owner);
                        System.out.println(Files.getOwner(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(path.getFileSystem().supportedFileAttributeViews());
                }
            });
        }
        listFileExtensionInFolder("ocp/src/main/java/javaNIO2", "java");
    }

    private static void listFileExtensionInFolder(String sourceFolder, String extension) throws IOException {
        Path path = Paths.get(sourceFolder);
        if (path.toFile().isFile()) return;
        try (Stream<Path> input = Files.walk(path)) {
            input.forEach(p -> {
                if (p.toString().endsWith(extension)) {
                    System.out.println(p);
                }
            });
        }
    }
}
