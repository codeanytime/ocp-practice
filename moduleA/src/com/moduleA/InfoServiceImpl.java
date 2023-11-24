package com.moduleA;

import service.InfoService;

/**
 * @author thanhch
 * <p>
 * Date: 24/11/2023
 * <p>
 * Class: InfoServiceImpl
 */
public class InfoServiceImpl implements InfoService {
    @Override
    public void printInfo() {
        System.out.println("Info in module A");
    }
}
