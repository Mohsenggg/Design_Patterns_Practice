package org.example.patterns.creational.zReview.builder;

public class Parser {

    private String request;
    private String response;
    private String connections;

    private Parser(Builder builder){
        this.request = builder.request;
        this.response = builder.response;
        this.connections = builder.connections;
    }

    public static class Builder {
        String request;
        String response;
        String connections;


        public Builder(String request,String response){
            this.request = request;
            this.response = response;
        }

        public Builder addConnection(String connections){
            this.connections = connections;
            return this;
        }

        public Parser build (){
            return new Parser(this);
        }


    }
}
