package com.clouway.io.task6;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.io.IOException;
import java.util.Scanner;

public class DirectoryBrowserDemo {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        DirectoryBrowser browser = new DirectoryBrowser();
        String tempPath = null;
        System.out.print("Enter the file path: ");
        tempPath = sc.nextLine();
        try {
            browser.listContent(tempPath);
        } catch (IOException | NotADirectory e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }
}
