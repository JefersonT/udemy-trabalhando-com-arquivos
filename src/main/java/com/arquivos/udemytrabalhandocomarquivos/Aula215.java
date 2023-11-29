package com.arquivos.udemytrabalhandocomarquivos;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class Aula215 {
    public static void main(String[] args) {

        String path = "/home/tqi_jtorres/Estudos/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                log.info(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            log.error("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
