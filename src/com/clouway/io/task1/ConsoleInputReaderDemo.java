package com.clouway.io.task1;

import java.io.IOException;

public class ConsoleInputReaderDemo {
    public static void main(String [] args){
        ConsoleInputReader read = new ConsoleInputReader();
        int tempInt = 0;
        try {
            tempInt = read.readInt();
        } catch (IOException e) {
            e.getMessage();
        } catch (NumberFormatException nfe){
            nfe.getStackTrace();
        }
        char tempChar = 0;
        try {
            tempChar = read.readChar();
        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.print("The integer is: " + tempInt + "\n");
        System.out.print("The char is: " + tempChar);
    }
}
