/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturahashset;

import java.util.Set;

/**
 ** @author    : Yuri Domingos 
 * Data       : 03 - 01 -2021
 * Objectivo : Simular o funcionamento da HashSet  
 * 
 * Obs (PT) : Nós usamos a collections set, quando vamos trabalhar com uma gama de informação inédita ( fará com que o sistema seja mais performático,
 * porque o HashSet não ordena os dados e não adiciona dados rtepitidos ) então fica com um desempenho  super cool 
 * 
 * obs (ENG) We use the collections set, when we are going to work with an unprecedented range of information (it will make the system more performative,
 * because HashSet does not sort the data and does not add repeating data) so it has super cool performance.


 */
 
public class HashSetFile {
    
    
    
    public void add_in_set_structres(Set<Integer> list, int value)
    {
        list.add(value);
        System.out.println("Numero adicionado com sucesso ");
    }
    
    public  void remove_element(Set<Integer> list, Integer value)
    {
        
        if( ! list.isEmpty())
        {
            list.remove(value);
            System.out.println("Elemento removido com sucesso ");
            
        }else
            
            System.out.println("Error! A lista ja esta vazia nao podemos remove o objecto da n ossa lista ");
            
        
    }
    
    public boolean search_elemnts_in_our_class_functions(Set<Integer> list, Integer value)
    {
        
        if ( ! list.isEmpty() && list.contains(value))
        {
            System.out.println(" Ohhh Elemento encontrado na nossa lista  " + value);
            return true;
            
        }
         return false;
    }
    
   // Se tentares ordenar, terás um erro de execução e depois será um de compilção 
    
    // Collections.sort((List) list);  um casting porque ele é por default do tipo list 
    
   public void show_elementers(Set<Integer> list)
   {
       for (Integer tmp : list)
       {
           
           System.out.print(tmp);
       }
   }
    
    
    public void show_layout_systems()
    {
        
        
        System.out.println("--------------------------------------------------------------------------------- ");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("|                       WELCOTE TO CATARINA MANUEL PROJECT                        |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                                 |");
        System.out.println("--------------------------------------------------------------------------------- ");
    }
    
    
    
    
}
