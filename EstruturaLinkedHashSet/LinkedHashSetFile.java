/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturalinkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * *
 * @author    : Yuri Domingos 
 * Data       : 03 - 01 -2021
 * Objectivo : Simular o funcionamento da HashSet  
 * 
 * Simulate the operation of LinkedHashSet (which is actually slower, correlation to HashSet, because it orders and does not allow repeated data)
 * But there are places (production scenarios) that are more technical to use LinkedHashSet


 * 
 * Objectivo : Explicar as grandes diferenças entre as collections 
 * 
 */
public class LinkedHashSetFile {
    
    
    
    
    
    public void add_in_set_structres(LinkedHashSet<Integer> list, int value)
    {
        list.add(value);
        System.out.println("Numero adicionado com sucesso ");
    }
    
    public  void remove_element(LinkedHashSet<Integer> list, Integer value)
    {
        
        if( ! list.isEmpty())
        {
            list.remove(value);
            System.out.println("Elemento removido com sucesso ");
            
        }else
            
            System.out.println("Error! A lista ja esta vazia nao podemos remove o objecto da n ossa lista ");
            
        
    }
    
    public boolean search_elemnts_in_our_class_functions(LinkedHashSet<Integer> list, Integer value)
    {
        
        if ( ! list.isEmpty() && list.contains(value))
        {
            System.out.println(" Ohhh Elemento encontrado na nossa lista  " + value);
            return true;
            
        }
         return false;
    }
    
   // Nem é necessário ordenar porque ele faz issoo automaticamente no desenvolvimento da nossa apliacation   
    
    // Collections.sort((List) list);  um casting porque ele é por default do tipo list 
    
   public void show_elementers(LinkedHashSet<Integer> list)
   {
       
       for (Integer tmp : list)
       {
           
           System.out.println(tmp);
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
