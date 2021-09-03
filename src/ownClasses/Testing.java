package ownClasses;

import java.util.Scanner;

public class Testing {
    static Testing[] testings = new Testing[100];
    static int counter = 0;
    String name;

    Testing(String name){
        this.name = name;
        testings[counter++] = this;
    }

    public Testing[] getTestings() {
        return testings;
    }

    public String getName() {
        return name;
    }
}