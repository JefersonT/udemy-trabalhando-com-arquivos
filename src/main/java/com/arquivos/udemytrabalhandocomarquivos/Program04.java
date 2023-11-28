package com.arquivos.udemytrabalhandocomarquivos;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class Program04 {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good night", "Good afternoon", "Good morning" };
        String path = "/home/tqi_jtorres/Estudos/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {// Sem true-> recria o arquivo; Com true -> adiciona o conteúdo no final do arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
