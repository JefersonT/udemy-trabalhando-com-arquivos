package com.arquivos.udemytrabalhandocomarquivos;

public class Produto {
    private String nome;
    private Double valor;
    private Integer qtd;

    public Produto(String[] line) {
        nome = line[0];
        valor = Double.valueOf(line[1]);
        qtd = Integer.valueOf(line[2]);
    }

    public String resultadoFinal() {
        double v = valor * qtd;
        return nome + "," + String.format("%.2f",v);
    }
}
