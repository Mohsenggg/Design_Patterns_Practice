package org.example.patterns.creational.bFactory.types;

public class CcServiceType implements GeneralType {
    @Override
    public String prepare() {
        System.out.println("Print Type Aa Service");
        return "good";
    }
}
