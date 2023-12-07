package working_with_array_collection;

import model.CustomResource;

import java.util.Scanner;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q1
 */
public class Q1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            System.out.println(s);
//            sc = null;
        }

        try (CustomResource res = new CustomResource()) {
            System.out.println("Start open custom resource");
        }
    }
}
