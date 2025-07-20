package org.example.patterns.creational.zReview.abstrac.factory;

import org.example.patterns.creational.zReview.types.parsers.Parse2GService;
import org.example.patterns.creational.zReview.types.parsers.TechnologyParser;
import org.example.patterns.creational.zReview.types.requests.Handle2GRequest;
import org.example.patterns.creational.zReview.types.requests.TechnologyRequest;

public class Factory2GTechnology implements TechnologyGeneralFactory {
    @Override
    public TechnologyParser getParser() {
        return new Parse2GService();
    }

    @Override
    public TechnologyRequest getRequest() {
        return new Handle2GRequest();
    }
}
