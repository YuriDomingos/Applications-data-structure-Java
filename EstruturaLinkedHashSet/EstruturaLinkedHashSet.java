/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturalinkedhashset;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author    : Yuri Domingos 
 * Data       : 03 - 01 -2021
 * Objectivo : Simular o funcionamento da LinkedHashSet ( que na verdade é mais lenta, correlação a HashSet, porque ordena e não permite dados repetidos   )
 *  Mas tem lugares ( cenários de produção ) que é mais técnico usar  as LinkedHashSet 
 * 
 * 
 * 
 * (EN) Simulate the operation of LinkedHashSet (which is actually slower, correlation to HashSet, because it orders and does not allow repeated data)
 * But there are places (production scenarios) that are more technical to use LinkedHashSet

 * Objectivo : Explicar as grandes diferenças entre as collections 
 * 
 * 
 */
public class EstruturaLinkedHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
       
        
        
        LinkedHashSet<Integer> list_number = new LinkedHashSet<>();
        
        LinkedHashSetFile methods  = new LinkedHashSetFile();
        
        methods.show_layout_systems();
         
        
        // OBS : desculpa por repetir linhas de códigos abaixo, mas é por um bom motivol 
        
        System.out.println("Type an Integer number ");
        
        int value = input.nextInt();
        methods.add_in_set_structres(list_number, value);
          
        System.out.println("Type an Integer number ");
        int value1 = input.nextInt();
        methods.add_in_set_structres(list_number, value1);
        
        System.out.println("Type an Integer number ");
        int value2 = input.nextInt();
        methods.add_in_set_structres(list_number, value2);
        
        methods.show_elementers(list_number);
        
        
        
        
        
          
          
          
          
    }
    
    
}
