package org.example.patterns.creational.zReview.abstrac.factory;

import org.example.patterns.creational.zReview.types.parsers.Parse4GService;
import org.example.patterns.creational.zReview.types.parsers.TechnologyParser;
import org.example.patterns.creational.zReview.types.requests.Handle4GRequest;
import org.example.patterns.creational.zReview.types.requests.TechnologyRequest;

public class Factory4GTechnology implements TechnologyGeneralFactory {
    @Override
    public TechnologyParser getParser() {
        return new Parse4GService();
    }

    @Override
    public TechnologyRequest getRequest() {
        return new Handle4GRequest();
    }
}
