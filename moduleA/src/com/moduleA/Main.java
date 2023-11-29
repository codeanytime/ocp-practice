package com.moduleA;

import com.moduleB.BClass;
import com.moduleB1.B1;
import service.InfoService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 24/11/2023
 * <p>
 * Class: Main
 */
public class Main {
    public static void main(String[] args) {
        BClass bClass = new BClass("cv");
        System.out.println(bClass.getName());

        B1 b1 = new B1("an");
        System.out.println(b1.getName());

//        InfoService infoService = new InfoServiceImpl();
//        infoService.printInfo();

        ServiceLoader<InfoService> loader = ServiceLoader.load(InfoService.class);
        InfoService service = loader.findFirst().orElseThrow(() -> new RuntimeException("No service"));
        service.printInfo();
        Path p1 = Paths.get("../../b/c");
        System.out.println(p1.normalize());

        Map<String, String> map = new HashMap<>();
        map.put("thanhch", "HN");
        map.merge("thanhch", "HN2", (s1, s2) -> {
            return "thi xa son tay";
        });
        System.out.println(map.get("thanhch"));

        Predicate<Integer> p = i -> i > 0;
        p = p.or(i -> i < 0).and(i -> i > 0);
        p.test(10);
        System.out.println(p.test(10));

        final int x = 1000;
        short y = x;

        TestEnum testEnum = TestEnum.DIRECT;
        System.out.println(testEnum.type);

        Integer intOpt = Stream.of(1).findAny().orElseGet(() -> getInteger());
//        Integer intOpt2 = Stream.of(1).findAny().orElse(getInteger());
        String pattern = "hello {2}, my name is {1}";
        String result = MessageFormat.format(pattern, "thanh", "nguyetnm", "abc");
        System.out.println(result);
        System.out.println(intOpt);

        List<Integer> list = List.of(2, 3, 4);
        Integer multiply = list.parallelStream().reduce(1, Integer::sum,(i1, i2) -> i1 * i2);
        System.out.println(multiply);

        List<Integer> list2 = List.of(2, 4, 5);
        boolean test = list2.stream().noneMatch(i -> i < 0);
        System.out.println(test);
        System.out.println(list2);
        Stream.of(Optional.ofNullable(null)).forEach(System.out::println);
        System.out.println(Optional.ofNullable(null));
        Map<String, String> mapInput = new HashMap<>();
        mapInput.compute("Jane", (s1, s2) -> "hi" + s2);
        System.out.println(mapInput.get("Jane"));
        System.out.println(mapInput);
    }

    static Integer getInteger() {
        throw new RuntimeException("RUNTIME EX OCCUR");
    }
}
