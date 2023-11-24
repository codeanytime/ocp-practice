package com.moduleA;

import com.moduleB.BClass;
import com.moduleB1.B1;
import service.InfoService;

import java.util.ServiceLoader;

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
    }
}
