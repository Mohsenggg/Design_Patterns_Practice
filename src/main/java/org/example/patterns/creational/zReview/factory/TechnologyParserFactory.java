package org.example.patterns.creational.zReview.factory;

import org.example.patterns.creational.zReview.types.parsers.Parse2GService;
import org.example.patterns.creational.zReview.types.parsers.Parse4GService;
import org.example.patterns.creational.zReview.types.parsers.TechnologyParser;

public class TechnologyParserFactory {

    public TechnologyParser getParser(String technology){

        if (technology.equalsIgnoreCase("2G")){
            return new Parse2GService();
        } else if (technology.equalsIgnoreCase("4G")){
            return new Parse4GService();
        } else {
            throw new IllegalStateException("No Parser Prepared");
        }
    }
}
