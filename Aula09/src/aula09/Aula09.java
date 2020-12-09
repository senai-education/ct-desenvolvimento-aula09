package aula09;

import Model.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula09 {

    public static void main(String[] args) {
        
        //CRIANDO ARRAYLIST COM OBJETOS GENERICOS(SEM TIPO) E ARMAZENANDO EM VARIAVEL TIPO LIST
        List listaGenerica = new ArrayList();
        
        //CRIANDO ARRAYLIST COM OBJETOS GENERICOS(SEM TIPO) E ARMAZENANDO EM VARIAVEL TIPO ARRAYLIST
        ArrayList listaGenericaDois = new ArrayList();
        
        //ADICIONANDO OBJETOS DENTRO DE LISTA. DESSA FORMA É POSSÍVEL ADICIONAR QUALQUER DADO QUE QUALQUER TIPO
        listaGenerica.add("TESTE COM STRING");
        listaGenerica.add(1000);
        listaGenerica.add(true);
        listaGenerica.add(2.0);
        listaGenerica.add(new Pessoa("Gustavo", 23));
        
        //ADICIONANDO OBJETOS DENTRO DE LISTA. DESSA FORMA É POSSÍVEL ADICIONAR QUALQUER DADO QUE QUALQUER TIPO
        listaGenericaDois.add("TESTE COM STRING");
        listaGenericaDois.add(1000);
        listaGenericaDois.add(true);
        listaGenericaDois.add(2.0);
        listaGenericaDois.add(new Pessoa("Gustavo", 23));
        
        
        //REMOVENDO DADOS DE DENTRO DA LISTA
        listaGenerica.remove(0); //REMOVE ELEMENTO NA POSIÇÃO ZERO DA LISTA
        listaGenericaDois.remove(0); //REMOVE ELEMENTO NA POSIÇÃO ZERO DA LISTA
        listaGenerica.remove(true); //REMOVE O ELEMENTO INFORMADO DA LISTA
        listaGenericaDois.remove(true); //REMOVE O ELEMENTO INFORMADO DA LISTA
        
        //CRIANDO LISTAS COM ELEMENTOS TIPADOS (NESSE CASO TIPOS STRING)
        List<String> listaString = new ArrayList();
        ArrayList<Pessoa> listaPessoa = new ArrayList();
        
        //ADICIONANDO VALORES
        listaString.add("UM");
        listaString.add("DOIS");
        listaString.add("TRÊS");
        listaString.add("QUATRO");
        
        //ADICIONANDO VALORES
        listaPessoa.add(new Pessoa("Gustavo", 23));
        listaPessoa.add(new Pessoa("Vanessa", 30));
        listaPessoa.add(new Pessoa("João", 26));
        listaPessoa.add(new Pessoa("Maria", 18));
               
        //ORDENANDO LISTA
        Collections.sort(listaString); //ORDENA LISTA DE TIPOS QUE TENHO UMA ORDENAÇÃO NATURAL
        
        //ORDENA LISTA COM ELEMENTOS SEM ORDENAÇÃO NATURAL
        Collections.sort(listaPessoa, new Comparator<Pessoa>(){ //NECESSÁRIO CRIAR UM COMPARATOR E INFORMAR QUAL ATRIBUTO VAI SER USADO PARA ORDENAR
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }   
        });
        
        //PERCORRE UM LISTA DE STRING COM O FOREACH
        for(String str : listaString){
            System.out.println(str);
        }
        
        //PERCORRE LISTA DE PESSOA COM FOREACH
        for(Pessoa pessoa : listaPessoa){
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
        }
        
    }
}
