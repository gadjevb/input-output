package com.clouway.io.task4;

import java.io.*;

public class TransferObjectDemo {
    public static void main(String [] args) {
        TransferObject transfer = new TransferObject();
        InputStream input = null;
        OutputStream output = null;
        try{
            input = new FileInputStream("Test");
            output = new FileOutputStream("TransferTest");
            System.out.println("Number of transferred bytes: " + transfer.transferObject(input, output, 0, 3));
        }catch (IOException ex){
            ex.getStackTrace();
        }finally {
            if(input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(output != null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
