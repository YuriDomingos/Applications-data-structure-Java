/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaqueue;

import java.util.Iterator;
import java.util.Queue;
import java.util.Random;

/**

 * @author   : Yuri Domingos
 * Data      : 03 - 01 - 2021
 * Objectivo : Refrescar as estruturas de dados  
 */
public class QueueFile {
   
    private Random random;

    public QueueFile() {
        
        random = new Random();
    }
    
    
    
    public void adicionar_tarefa_no_processador(Queue<String> processador, String process)
    {
         int PID = random.nextInt()%200;
         
         processador.add(process);
        
         System.out.println("PID        |       Name");
         System.out.println( PID    +      "     |     "+process);
         
         System.out.println("Processo adicionado com sucesso");
         
    }
    
    public void show_all_process_like_top_comand(Queue<String> processador)
    {
        if( ! processador.isEmpty())
        {
            
            System.out.println("--------------------------- Lista dos processos Existente na CPU --------------------");
            Iterator<String> all_user_process = processador.iterator();
            
            while(all_user_process.hasNext())
            {
                System.out.println("Nome - "+all_user_process.next());
            }
        }
    }
    
    
    
    public  void remove_process_from_cpu(Queue<String> processador)
    {
        if (! processador.isEmpty() )
        {
            processador.poll(); // this line will take I mean will remove the object 
            System.out.println("Processo removido da cpu com sucesso ");
        }else
            
            System.out.println("Error ! Lista vazia ");
    }
    
    
    public  boolean search_process_in_cpu(Queue<String> processador, String process)
    {
        if(! processador.isEmpty())
        {
            if(processador.contains(process))
                return true;
            
        }
        return false;
    }
    
    public  void take_any_process_to_kill(Queue<String> processador, String process)
    {
        if (search_process_in_cpu(processador,process))
        {
           String processo = processador.peek();
            System.out.println("O process foi encontrado | name  " +processo);
        }else
            System.out.println("Error ! Threre is no condition to take the process from the CPU ");
    }
    
   // obs : Nesta estrutura de dados ( fila) não temos a possibilidade de ordenar a fila porque, a fila preserva a ordem dos dados ! FIFO ( first in - first-out )
   
   public void destroy_the_queue(Queue<String> processador)
   {
      if( ! processador.isEmpty())
      {
         processador.clear();
      }else
        
        System.out.println("Sorry ! Invalid Actions \n");
      
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
