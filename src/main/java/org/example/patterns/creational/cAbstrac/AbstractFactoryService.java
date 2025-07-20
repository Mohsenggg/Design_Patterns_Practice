package org.example.patterns.creational.cAbstrac;

import org.example.patterns.creational.cAbstrac.factory.AaFactory;
import org.example.patterns.creational.cAbstrac.factory.GeneralFactory;

public class AbstractFactoryService {

    GeneralFactory factory = new AaFactory();

    public String getDataFromFactory(){

        factory.createService();
        return factory.createParser().parse();

    }


}
