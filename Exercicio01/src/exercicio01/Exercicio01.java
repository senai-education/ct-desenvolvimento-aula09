package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        
        //CRIA O ARRAYLIST DE INTEGER
        ArrayList<Integer> lista = new ArrayList();
        
        
        //CAPTURA 10 NÚMEROS INFORMADOS PELO USUÁRIO E ADICIONA NA LISTA
        int contador = 0;
        do {
            System.out.println("INFORME UM NÚMERO");
            Scanner s = new Scanner(System.in);
            int valor = s.nextInt();
            if(valor == 10 || valor == 100 || valor == 1000){
                System.out.println("VOCÊ GANHOU UM BONUS DE R$50,00");
            }
            lista.add(valor); //ADICIONA OS VALORES A LISTA
            contador++;
        }while(contador < 10);
        
        //PERCORRE E MOTRA TODA A LISTA
        for(int valor : lista){
            System.out.println("VARLO: " + valor);
        }
    }
    
}
