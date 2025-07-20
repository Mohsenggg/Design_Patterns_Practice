package org.example.patterns.creational.zReview.abstrac;

import org.example.patterns.creational.zReview.abstrac.factory.Factory2GTechnology;
import org.example.patterns.creational.zReview.abstrac.factory.Factory4GTechnology;
import org.example.patterns.creational.zReview.abstrac.factory.TechnologyGeneralFactory;

public class TechnologyFactoryService {

    public TechnologyGeneralFactory getFactory(String technology){

        return switch (technology){
            case "2G" -> new Factory2GTechnology();
            case "4G" -> new Factory4GTechnology();
            default ->  throw new IllegalStateException("Factory for " +technology+  " technology are not prepared");
        };
    }

}
