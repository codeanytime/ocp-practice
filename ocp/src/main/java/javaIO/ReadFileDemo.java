package javaIO;

import java.io.*;

/**
 * @author thanhch
 * <p>
 * Date: 10/10/2023
 * <p>
 * Class: ReadFileDemo
 */
public class ReadFileDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/thanhch/Documents/WORK/ocp-practice/ocp/src/main/java/javaIO/IO.md";
        String outputPath = "/Users/thanhch/Documents/WORK/ocp-practice/ocp/src/main/java/javaIO/copy.md";
        File file = new File(filePath);
        System.out.println(file);
        System.out.println(System.getProperty("file.encoding"));
        copyFile(outputPath, file);
        copyFileByReaderAndWriter(outputPath, file);
    }

    public static void copyFile(String outputPath, File input) throws IOException{
        try (InputStream in = new BufferedInputStream(new FileInputStream(input));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(outputPath))){
//            int b;
//            while((b = in.read()) != -1) {
//                out.write(b);
//            }

            // Improvement above code block
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer,0,lengthRead);
                out.flush();
            }
        }
    }

    public static void copyFileByReaderAndWriter(String outputPath, File input) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(input));
            BufferedWriter out = new BufferedWriter(new FileWriter(outputPath))) {
            String s;
            while ((s = in.readLine()) != null) {
                if (s.contains("File")) {
                    s = s.replace("File", "File class");
                }
                out.write(s);
                out.newLine();
            }
        }
    }
}
