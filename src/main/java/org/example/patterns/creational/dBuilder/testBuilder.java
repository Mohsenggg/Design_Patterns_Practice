package org.example.patterns.creational.dBuilder;

public class testBuilder {


    public static void main(String[] args) {

        String request = "Request";
        String response = "Response";
        Parser parser = new Parser.Builder(request,response)
                .build();

        Parser filledParser = new Parser.Builder(request,response)
                .addData("data")
                .build();

    }
}
