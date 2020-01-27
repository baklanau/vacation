package com.itechart.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileUtils {
    File file = new File("src/main/resources/files/input.txt");
    FileReader fileReader;

    {
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    BufferedReader bufferedReader = new BufferedReader(fileReader);



}
