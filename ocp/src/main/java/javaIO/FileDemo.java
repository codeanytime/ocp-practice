package javaIO;

import java.io.File;

/**
 * @author thanhch
 * <p>
 * Date: 10/10/2023
 * <p>
 * Class: FileDemo
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("/Users/thanhch/Documents/WORK/ocp-practice/ocp/src/main/java/javaIO/IO.md");
        if (file.isFile()) {
            System.out.println("File is a file");
        }
        File fileGit = new File("/Users/thanhch/Documents/WORK/ocp-practice/.git");
        if (fileGit.isHidden()) {
            System.out.println("file is hidden");
        }
        if (fileGit.isDirectory()) {
            System.out.println("Directory");
        }
        if (file.isDirectory()) {
            System.out.println("Directory");
        }
        System.out.println(fileGit.lastModified());
    }
}
