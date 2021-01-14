/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturalist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author    : Yuri Domingos 
 * Data       : 03 - 01 -2021
 * Objectivo  : Demonstrar a aplicação da estrutura de dados ( list ) num mini projecto 
 */
public class EstruturaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        
        List<String> lista = new ArrayList<>();
        Methods methods = new  Methods();
        
     
             methods.show_layout_systems();
             
              //--- Eu sei que não faz parte dos bons costumes  escrever as linhas do jeito que escrevi abaixo (sobre a entrada dos nomes ) mas é para ajudar os mais iniciantes no assunto, então me desculpa velho veterano klkkk
             System.out.println("TYpe any student name please :");
             String nome = input.nextLine();
             methods.add_student(lista, nome);
             
             System.out.println("TYpe any student name please :");
             String nome_other = input.nextLine();
             methods.add_student(lista,nome_other);
             
             
             
             methods.show_list(lista);
             
             methods.remover_student(lista, nome_other);
              
             System.out.println(" After - remove student Element");
             
             methods.show_list(lista);
             
             methods.take_any_student(lista, nome);
             
             methods.clean_up(lista);
              
             methods.show_list(lista);
             
         
      
        
        
        
  
        
        
    }
    
}
