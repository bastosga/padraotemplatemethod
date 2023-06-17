package org.example;

public class CarroUsado extends Carro{

    public Integer quilometragem;

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    @Override
    public String verificarConservacao() {
        if (this.getQuilometragem() >= 100000){
            return "Carro Não Conservado";
        }
        else {
            return "Carro conservado";
        }
    }

    @Override
    public String getTipo(){
        return "Carro usado";
    }
}
