package javaNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.sql.Timestamp;
import java.time.Instant;

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
        System.out.println(ResourceManage.getBasicAttributes(hardLink).lastModifiedTime());
        ResourceManage.getBasicAttributeView(hardLink).setTimes(FileTime.from(Instant.parse("1999-10-11T12:51:38.209922Z")),
                null,
                null);
        System.out.println("1 --- " + ResourceManage.getBasicAttributes(hardLink).lastModifiedTime());
        System.out.println(ResourceManage.getBasicAttributeView(hardLink).readAttributes().isDirectory());

//        Path pathFolder = Paths.get("/Users/thanhch/Documents/WORK/ocp-practice/ocp/src/main/java/javaNIO2/copyFolder/tmp");
//        Path symLink = Files.createSymbolicLink(Paths.get("/Users/thanhch/Documents/WORK/ocp-practice/ocp/src/main/java/javaNIO2/123.txt"),
//                pathFolder);
//        System.out.println(Files.isDirectory(symLink));
//        System.out.println(Files.isRegularFile(link));

        Path path1 = Paths.get("/pets/../cat.txt");
        Path path2 = Paths.get("./dog.txt");
        System.out.println(path1.getRoot());
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));
    }
}
