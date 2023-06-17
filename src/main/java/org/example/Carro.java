package org.example;

public abstract class Carro {
    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo(){
        return "Carro novo";
    }

    public abstract String verificarConservacao();

    public String getInfo() {
        return getTipo() + "{" +
                "modelo=" + this.modelo +
                ", marca=" + this.marca  +
                ", conservação=" + this.verificarConservacao() +
                '}';
    }

}
