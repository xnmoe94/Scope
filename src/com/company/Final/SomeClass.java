package com.company.Final;

public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;


    public SomeClass(String name) {
        this.instanceNumber = classCounter;
        this.name = name;
        classCounter++;
        System.out.println(name + " created, instance is " + instanceNumber);


    }
}
