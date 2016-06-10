package com.clouway.io.task2;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleReaderDemo {
    public static void main(String [] args){
        ConsoleReader writer = new ConsoleReader();
        writer.readTillReach(".");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the text file you wish to write in: ");
        String fileName = sc.nextLine();
        System.out.println("You can begin with the input of your information! The default mark for ending is a single dot!");
        try {
            writer.write(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("The file is closed!");
    }
}
