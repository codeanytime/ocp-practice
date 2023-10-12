package javaNIO2;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 13/10/2023
 * <p>
 * Class: PathDemo
 */
public class PathDemo {
    public static void main(String[] args) throws IOException, URISyntaxException {
//        Path path = Paths.get("NIO2.md");
        Path path = FileSystems.getDefault().getPath("ocp/src/main/java/javaNIO2/NIO2.md").toAbsolutePath();
        System.out.println(path.getRoot());
        System.out.println(path.getName(0));
        File file = path.toFile();
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(System.getProperty("path.separator"));
        Path path2 = Paths.get("/Users/thanhch/Documents/WORK/ocp-practice/.git");
//        AclFileAttributeView view = Files.getFileAttributeView(path2, AclFileAttributeView.class);
//        System.out.println(view.getAcl());
        PosixFileAttributes attributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println("OWNER " + attributes.owner());
        System.out.println("PERMISSION " + PosixFilePermissions.toString(attributes.permissions()));

        try (Stream<String> input = Files.lines(path)) {
            input.forEach(System.out::println);
        }

        Path pathProject = Paths.get("ocp/src/main/java");
        Files.walk(pathProject).map(Path::getFileName).forEach(System.out::println);
        StringBuilder sb = new StringBuilder();
        sb.append("abc").insert(1, 12).insert(3, 'A');
        System.out.println(sb);

        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add(2, "abc");
        list.stream().forEach(System.out::println);

        Path path3 = Paths.get("habitat");
        Path path4 = Paths.get("E:\\sanctuary\\raven");
        System.out.println(path3.isAbsolute());
        System.out.println(path3.normalize());
        System.out.println(path4.normalize());
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));

    }
}
