package org.example.patterns.creational.cAbstrac.types.services;

public class CcServiceType implements GeneralServiceType {
    @Override
    public String prepare() {
        System.out.println("Print Type Aa Service");
        return "good";
    }
}
