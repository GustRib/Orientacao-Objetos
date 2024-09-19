package com.example;

public class Calculadora {

    private int valorMemoria = 0;

    public void soma(int valor) {
        valorMemoria += valor;
    }

    public void subtracao(int valor) {
        valorMemoria -= valor;
    }

    public void multiplicacao(int valor) {
        valorMemoria *= valor;
    }

    public void divisao(int valor) {
        if(valor !=0) 
            valorMemoria /= valor;
        else
            System.out.println("Erro: Divisao por zero!");
    }

    public void limpaMemoria(int valor) {
        valorMemoria = 0;
    }

    public int getValorMemoria() {
        return valorMemoria;
    }

}