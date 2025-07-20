package org.example.patterns.creational.bFactory;

import org.example.patterns.creational.bFactory.types.GeneralType;

public class ProcessTypeService {
    String typeName = "Aa";

    public String getSomethingFromTypeService(){

        GeneralType type = FactoryMethodService.getTypeService(typeName);
        return type.prepare();

    }

}
