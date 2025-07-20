package org.example.patterns.creational.dBuilder;

public class Parser {

    private String data;
    private String request;
    private String response;

    private Parser(Builder builder) {
        this.data = builder.data;
        this.request = builder.request;
        this.response = builder.response;
    }


    public static class Builder {

        // Required ----------
        private String request;
        private String response;
        // Optional ----------
        private String data;


        public Builder(String request, String response){
            this.request = request;
            this.response = response;
        }

        public Builder addData(String data){
            this.data = data;
            return this;
        }

        public Parser build(){
            return new Parser(this);
        }
    }

}

