package org.example.patterns.creational.ePrototype;

public class Tree implements Cloneable{

    private String size;
    private String age;
    private String type;

    public Tree(String size, String age, String type) {
        this.size = size;
        this.age = age;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public Tree clone() {
        try {
            // Shallow copy
            return (Tree) super.clone();
            // Deep copy
//            Tree cloned  = (Tree) super.clone(); // take a clone from the original
//            cloned.type = new String(this.type); // set type for the new instance
//            return cloned;

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }



    @Override
    public String toString() {
        return "Tree{" +
                "size='" + size + '\'' +
                ", age='" + age + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}
