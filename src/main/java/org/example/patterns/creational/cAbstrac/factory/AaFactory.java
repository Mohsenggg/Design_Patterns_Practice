package org.example.patterns.creational.cAbstrac.factory;

import org.example.patterns.creational.cAbstrac.types.parsers.GeneralParserType;
import org.example.patterns.creational.cAbstrac.types.parsers.TypeAaParser;
import org.example.patterns.creational.cAbstrac.types.services.AaServiceType;
import org.example.patterns.creational.cAbstrac.types.services.GeneralServiceType;

public class AaFactory implements GeneralFactory {
    @Override
    public GeneralParserType createParser() {
        return new TypeAaParser();
    }

    @Override
    public GeneralServiceType createService() {
        return new AaServiceType();
    }
}
