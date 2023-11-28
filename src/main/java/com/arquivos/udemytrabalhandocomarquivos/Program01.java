package com.arquivos.udemytrabalhandocomarquivos;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@Slf4j
public class Program01 {
    public static void main(String[] args) {

        File file = new File("/home/tqi_jtorres/Estudos/in.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                log.info(scanner.nextLine());
            }
        } catch (IOException e) {
            log.info("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
