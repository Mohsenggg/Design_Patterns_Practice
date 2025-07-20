package org.example.patterns.creational.zReview.abstrac.factory;

import org.example.patterns.creational.zReview.types.parsers.TechnologyParser;
import org.example.patterns.creational.zReview.types.requests.TechnologyRequest;

public interface TechnologyGeneralFactory {
    TechnologyParser getParser();
    TechnologyRequest getRequest();
}
