package com.arquivos.udemytrabalhandocomarquivos;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Scanner;

@Slf4j
public class ExercicioProposto220 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File pathInitial = new File(strPath);

        new File(pathInitial.getParent() + "/out").mkdir();
        String path = pathInitial.getParent() + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String line = br.readLine();

            while (line != null) {
                Produto p = new Produto(line.split(","));
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                    bw.write(p.resultadoFinal());
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                line = br.readLine();
            }
        } catch (IOException e) {
            log.error("Error: " + e.getMessage());
        }



        sc.close();
    }
}
