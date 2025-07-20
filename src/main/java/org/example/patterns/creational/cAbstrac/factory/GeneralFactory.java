package org.example.patterns.creational.cAbstrac.factory;

import org.example.patterns.creational.cAbstrac.types.parsers.GeneralParserType;
import org.example.patterns.creational.cAbstrac.types.services.GeneralServiceType;

public interface GeneralFactory {
    GeneralParserType createParser();
    GeneralServiceType createService();

}
