package com.arquivos.udemytrabalhandocomarquivos;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Slf4j
public class Program05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        if (folders != null) {
            for (File folder : folders) {
                System.out.println(folder);
            }
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("FILES: ");
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }

        boolean success = new File(strPath + "/subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
