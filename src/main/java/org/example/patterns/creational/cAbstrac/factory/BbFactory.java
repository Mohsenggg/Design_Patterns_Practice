package org.example.patterns.creational.cAbstrac.factory;

import org.example.patterns.creational.cAbstrac.types.parsers.GeneralParserType;
import org.example.patterns.creational.cAbstrac.types.parsers.TypeBbParser;
import org.example.patterns.creational.cAbstrac.types.services.BbServiceType;
import org.example.patterns.creational.cAbstrac.types.services.GeneralServiceType;

public class BbFactory implements GeneralFactory {
    @Override
    public GeneralParserType createParser() {
        return new TypeBbParser();
    }

    @Override
    public GeneralServiceType createService() {
        return new BbServiceType();
    }
}
