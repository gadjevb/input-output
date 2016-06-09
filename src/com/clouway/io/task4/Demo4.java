package com.clouway.io.task4;

import java.io.*;
import java.util.Scanner;

public class Demo4 {
    public static void main(String [] args) {
        TransferObject transfer = new TransferObject();
        Scanner sc = new Scanner(System.in);
        InputStream input = null;
        OutputStream output = null;
        String tempInput, tempOutput;
        int offset = 0, size = 0;
        System.out.print("Enter the input stream file: ");
        tempInput = sc.nextLine();

        try{
            input = new FileInputStream(tempInput);
        }catch (FileNotFoundException fnf){
            fnf.getStackTrace();
        }

        System.out.print("Enter the output stream file: ");
        tempOutput = sc.nextLine();

        try{
            output = new FileOutputStream(tempOutput);
        }catch (FileNotFoundException fnf){
            fnf.getStackTrace();
        }

        System.out.print("Enter the offset: ");
        offset = sc.nextInt();
        System.out.print("Enter the size: ");
        size = sc.nextInt();
        try {
            System.out.println("Number of transferred bytes: " + transfer.transferObject(input, output, offset, size));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
