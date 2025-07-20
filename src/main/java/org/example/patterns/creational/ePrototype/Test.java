package org.example.patterns.creational.ePrototype;

public class Test {

    public static void main(String[] args) {
        Tree originalTree = new Tree("size","age","type");
        Tree copiedTree =  originalTree.clone();
        copiedTree.setType("new Type");


        System.out.println(originalTree.toString());
        System.out.println(copiedTree.toString());
    }
}
