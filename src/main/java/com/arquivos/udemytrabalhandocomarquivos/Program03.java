package com.arquivos.udemytrabalhandocomarquivos;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Slf4j
public class Program03 {
    public static void main(String[] args) {

        String path = "/home/tqi_jtorres/Estudos/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                log.info(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            log.error("Error: " + e.getMessage());
        }
    }
}
