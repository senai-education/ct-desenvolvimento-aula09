package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        //CRIA AS DUAS LISTAS
        ArrayList<String> lista1 = new ArrayList();
        ArrayList<String> lista2 = new ArrayList();
        
        //SOLICITA STRNGS AO USUÁRIO
        int contador = 0;
        do {
            System.out.println("INFORME UMA STRING");
            Scanner s = new Scanner(System.in);
            String valor = s.nextLine();
            lista1.add(valor); //ADICIONA OS VALORES A LISTA
            contador++;
        }while(contador < 10);
 
        //ADICIONA NA SEGUNDA LISTA OS ELEMENTOS QUE TEM MENOS QUE 3 LETRAS
        for(String str: lista1){
            if(str.length() <= 3){
                lista2.add(str);
            }
        }
        
        //REMOVE OS ELEMENTOS EXISTENTES NA SEGUNDA LISTA DA PRIMEIRA
        lista1.removeAll(lista2);
        
        //MOSTRA LISTA UM
        System.out.println("LISTA 1");
        for(String str: lista1){
            System.out.println(str);
        }
        
        //MOSTRA LISTA DOIS
        System.out.println("LISTA 2");
        for(String str: lista2){
            System.out.println(str);
        }
    }
}
