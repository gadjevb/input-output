package com.clouway.io.task2;

import java.io.IOException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String [] args){
        ConsoleInput writer = new ConsoleInput();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the text file you wish to write in: ");
        String fileName = sc.nextLine();
        System.out.println("You can begin with the input of your information, if you wish to stop, enter a single dot!");
        try {
            writer.writeInFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("The file is closed!");
    }
}
