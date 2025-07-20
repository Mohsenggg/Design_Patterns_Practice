package org.example.patterns.creational.bFactory;

import org.example.patterns.creational.bFactory.types.AaServiceType;
import org.example.patterns.creational.bFactory.types.CcServiceType;
import org.example.patterns.creational.bFactory.types.BbServiceType;
import org.example.patterns.creational.bFactory.types.GeneralType;

public class FactoryMethodService {

    public static GeneralType getTypeService(String type){

        return switch (type){
            case "Aa" -> new AaServiceType();
            case "Bb" -> new BbServiceType();
            case "Cc" -> new CcServiceType();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };


    }
}
