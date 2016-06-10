package com.clouway.io.task3;

import java.io.IOException;

public class TextFileDemo {
    public static void main(String [] args){
        TextFile reverse = new TextFile();
        try {
            System.out.println(reverse.reverseFile("Test"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
