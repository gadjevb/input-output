package com.clouway.io.task6;

import java.io.IOException;
import java.nio.file.*;
import java.io.File;

public class DirectoryBrowser {

    public void listContent(String path) throws IOException, NotADirectory {
        Path dir = Paths.get(path);
        File flagFile = new File(path);
        if(flagFile.isFile()){
            throw new NotADirectory();
        }else {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                for (Path file : stream) {
                    System.out.println(file.getFileName());
                }
            }
        }
    }
}
