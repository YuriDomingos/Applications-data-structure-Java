/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturahashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author    : Yuri Domingos 
 * Data       : 03 - 01 -2021
 * Objectivo : Simular o funcionamento da HashSet  
 * 
 * Obs (PT) : Nós usamos a collections set, quando vamos trabalhar com uma gama de informação inédita ( fará com que o sistema seja mais performático,
 * porque o HashSet não ordena os dados e não adiciona dados rtepitidos ) então fica com um desempenho  super cool 
 * 
 * obs (ENG) We use the collections set, when we are going to work with an unprecedented range of information (it will make the system more performative,
 * because HashSet does not sort the data and does not add repeating data) so it has super cool performance.


 */

public class EstruturaHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        HashSetFile methods = new HashSetFile();
        Set<Integer> list_number = new HashSet<>();
        
        System.out.println("Type an Integer Element to increase all element but after just to be with them   after ");       
        int value = input.nextInt();
        methods.add_in_set_structres(list_number, value);
        
        System.out.println("-----------------------------------------------------------------");
                
        System.out.println("Type an Integer Element to increase all element but after just to be with them   after ");       
        int value1 = input.nextInt();
        methods.add_in_set_structres(list_number, value1);
        
        methods.show_elementers(list_number);
        
        methods.show_layout_systems();
        
        
        
       
 
     
      
    }
    
}
