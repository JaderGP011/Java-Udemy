import java.util.*;
import java.util.stream.Collectors;

public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Adicionar elementos à lista
        list.add("Maria");
        list.add("alex");
        list.add("bob");
        list.add("ana");
        list.add("moises");

        // Alterar elemento 
        list.add(2, "Jonas");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------");
        //Ver tamanho da lista 
        System.out.println(list.size());
        
        //remover elemento 
        list.remove("ana"); //Removeu comparando as informações
        list.remove(1); //Removeu pela posição
        list.removeIf(x -> x.charAt(0) == 'a'/*Aqui usa aspas simples '' */); //Removeu por predicado
        
        System.out.println("------------------");
        for (String x : list) {
            System.out.println(x);
        }
        
        System.out.println("------------------");
        //Procurar posição
        System.out.println("Index of bob: " + list.indexOf("bob"));
        System.out.println("Index of Ana: " + list.indexOf("ana")); //tentando achar alguem que não está na lista
        
        System.out.println("------------------");
        //Filtrar lista 
        System.out.println("filtro lista");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'm').findFirst().orElse(null);
        System.out.println(name);
        
    }
}
