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
 * Class: SymbolicLinkDemo
 */
public class SymbolicLinkDemo {
    public static void main(String[] args) throws IOException {
        ResourceManage.clear(ResourceManage.FOLDER_TMP, "txt");
        ResourceManage.clearSymbolicLink("123.txt");
        ResourceManage.clearLink("234.txt");
        Path path = Paths.get(ResourceManage.FOLDER_TMP).resolve("abc.txt");
        if (path.toFile().exists()) {
            System.out.println("File exist");
        } else {
            Files.createFile(path);
        }

        Path link = ResourceManage.createSymbolicLink(path, "123.txt");
        Path hardLink = ResourceManage.createLink(path, "234.txt");
        if (link.toFile().isFile()) {
            System.out.println("FILE");
        } else if (link.toFile().isDirectory()) {
            System.out.println("DIRECTORY");
        }
        System.out.println(Files.isSymbolicLink(link));
        System.out.println(Files.readSymbolicLink(link));
    }
}
