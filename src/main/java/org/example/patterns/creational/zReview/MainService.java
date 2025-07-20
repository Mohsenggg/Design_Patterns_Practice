package org.example.patterns.creational.zReview;

import org.example.patterns.creational.zReview.abstrac.TechnologyFactoryService;
import org.example.patterns.creational.zReview.abstrac.factory.TechnologyGeneralFactory;
import org.example.patterns.creational.zReview.factory.TechnologyParserFactory;
import org.example.patterns.creational.zReview.types.parsers.TechnologyParser;

public class MainService {

    TechnologyParserFactory technologyParserFactory;
    String technology = "2G";
    TechnologyParser parser = technologyParserFactory.getParser(technology);

    // ----------------------------------------


    TechnologyFactoryService technologyFactoryService;

    TechnologyGeneralFactory factory = technologyFactoryService.getFactory(technology);

}
