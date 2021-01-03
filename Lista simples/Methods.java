/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author    : Yuri Domingos 
 * Data       : 03 - 01 -2021
 * Objectivo  : Demonstrar a aplicação da estrutura de dados ( list ) num mini projecto 
 */
public class Methods {
    
  
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
    
   public void add_student(List<String> student_list, String student_name )
   {
       
       if (  student_list.size()>= 45)
       {
           System.out.println("Error ! There is no condition to add student ");
           
       }else{
           
                 student_list.add(student_name);
                 
                 System.out.println("Estudante Matriculado com sucesso ");
       }
       
   }
   
   
   
   public void show_list(List<String> student_list)
   {
       
      if (! student_list.isEmpty())
      {
          
          Collections.sort(student_list);
          
          Iterator<String>  student = student_list.iterator();
         
          System.out.println("-------------  Lista dos estudantes matriculados na cadeira de Economia 2");
          
          while(student.hasNext())
          {
             
              System.out.println(" Estudante Nome " +student.next());
          }
          
          // a outra forma que pode ser usada para analisar ou seja percorrer  uma lista é usar o velho forech cuja implemntação seria 
          
          /*
          for( String student_temporary_name : student_list)
          {
              System.out.println(student_temporary_name);
          }*/
          
      }
      else
           System.out.println("Error ! the student list is empty ");
   }
   
   public void remover_student(List<String> student_list, String name_student)
   {
       
       if (!student_list.isEmpty() && student_list.contains(name_student))
       {
           student_list.remove(name_student);
           
           System.out.println("Aluno " +name_student +" removido com sucesso ");
           
       }else
           
           System.out.println("Error ! There is no conditions to add student ");
   }
   
   public void take_any_student(List<String> student_list, String name_student)
   {
          if (!student_list.isEmpty() && student_list.contains(name_student))
          {
                int tmp_position = student_list.indexOf(name_student);
                String tmp_search_name = student_list.get(tmp_position);
                
                System.out.println("The Student was found : "+tmp_search_name);
                
          }else
              System.out.println("Error ! There is no conditions to do this actions ");
              
   }
   
   public void clean_up(List<String> student_list)
   {
       
      if (! student_list.isEmpty())
      {
          student_list.clear();
          
      }else
           System.out.println(" Error the just is empty ");
          
   }
    
}
