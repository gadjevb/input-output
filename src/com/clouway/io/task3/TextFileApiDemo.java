package com.clouway.io.task3;

import java.io.IOException;

public class TextFileApiDemo {
    public static void main(String [] args){
        TextFileApi reverse = new TextFileApi();
        try {
            System.out.println(reverse.reverseFile("Test"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
