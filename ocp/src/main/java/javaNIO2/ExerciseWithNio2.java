package javaNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 15/10/2023
 * <p>
 * Class: ExerciseWithNio2
 */
public class ExerciseWithNio2 {
    public static void main(String[] args) throws IOException {
        Path folder = Paths.get(ResourceManage.FOLDER_TMP);
//        Files.walk(folder, 0).forEach(System.out::println);
        Files.find(folder, 2, (p, a) -> a.isRegularFile()).map(p -> p.toString()).collect(Collectors.toList())
                .stream()
                .filter(s -> s.endsWith("txt"))
                .forEach(System.out::println);

        Path folderTmp = Paths.get(ResourceManage.FOLDER_TMP).resolve("tmp");

        // Exception when folder tmp not empty
//        Files.deleteIfExists(folderTmp);
        Path path1 = Paths.get("/lizard/././actions/../walking.txt");
        Path path2 = Paths.get("/abc");
        Path path3 = Paths.get("abc");
        Path path4 = Paths.get("C:\\abc");

        // = abc do path3 la absolute path (bat dau bang /)
        System.out.println(path1.resolve(path2));
        // = path1 + path3 (path3 coi la thu muc - path3 relative path)
        System.out.println(path1.resolve(path3));
        // = path1
        System.out.println(path3.resolve(path1));
        System.out.println(path1.resolve(path4));
    }
}
