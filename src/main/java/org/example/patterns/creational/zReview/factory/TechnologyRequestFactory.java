package org.example.patterns.creational.zReview.factory;

import org.example.patterns.creational.zReview.types.requests.Handle2GRequest;
import org.example.patterns.creational.zReview.types.requests.Handle4GRequest;
import org.example.patterns.creational.zReview.types.requests.TechnologyRequest;

public class TechnologyRequestFactory {
    public TechnologyRequest getRequest (String technology){

        return switch (technology){
            case "2G" -> new Handle2GRequest();
            case "4G" -> new Handle4GRequest();
            default -> throw new IllegalStateException("Request Not Prepared");
        };
    }
}
