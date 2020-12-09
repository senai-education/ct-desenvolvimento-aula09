package exercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        //CRIA LISTA
        ArrayList<String> lista = new ArrayList();
        
        //SOLICITA STRNGS AO USUÁRIO
        int contador = 0;
        do {
            System.out.println("INFORME UMA STRING");
            Scanner s = new Scanner(System.in);
            String valor = s.nextLine();
            lista.add(valor); //ADICIONA OS VALORES A LISTA
            contador++;
        }while(contador < 10);
 
        //PERCORRE E MOSTRA LISTA COMPLETA COMO INFORMADA
        for(String str: lista){
            System.out.println("VALOR: " +str);
        }
        
        Collections.sort(lista); //ORDENA LISTA DE STRINGs
        
        //PERCORRE E MOSTRA LISTA COMPLETA ORDENADA
        for(String str: lista){
            System.out.println("VALOR: " +str);
        }
      
    }
    
}
