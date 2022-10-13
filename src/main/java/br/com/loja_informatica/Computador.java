package br.com.loja_informatica;

public class Computador {

    private int id;
    private String hd;
    private String processador;
    private static String marca = "EduardoFeitosa";

    public Computador() {
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Computador.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
