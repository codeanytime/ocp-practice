package concurrency;

import concurrency.model.Task;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 02/10/2023
 * <p>
 * Class: Main
 */
public class Main {
    public static void main(String[] args) {
//        Task task = new Task();
//
//        while(Task.count < 10) {
//            new Thread(task).start();
//        }
        Map<String, String> test = new HashMap<>();
        test.put("hello", "hi");
        test.put("hello", "haha");
        System.out.println(test);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        list1.retainAll(list2);
        System.out.println(list1);
        List<String> listStr = new ArrayList<>();
        listStr.add("thanhch@gmail.com");
        listStr.add("huy@gmail.com");
        listStr.add("thanh@nal.vn");
        System.out.println(listStr);
        String emailListStr = String.join(",", listStr);
        System.out.println(emailListStr);
        List<String> listStr2 = new ArrayList<>(Arrays.asList(emailListStr.split(",")));
        System.out.println(listStr2);
    }


}
