package com.clouway.io.task6;

public class NotADirectory extends Throwable {
    public NotADirectory(){
        super();
    }

    @Override
    public String getMessage(){
        return "The path leads to a file, not a directory!";
    }
}
