/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author   : Yuri Domingos
 * Data      : 03 - 01 - 2021
 * Objectivo : Refrescar as estruturas de dados ( fila) sistemas de transações 
 *
 */
public class EstruturaQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner input = new Scanner(System.in);
       
          Queue<String> CPU = new LinkedList<>();
         
          QueueFile methods = new QueueFile();
          
          methods.show_layout_systems();  // first time to show the problem 
          
          System.out.println("Type the process name to put in your CPU ");
          String process_name = input.nextLine();
          
          methods.adicionar_tarefa_no_processador(CPU, process_name);
          
          methods.show_all_process_like_top_comand(CPU);
          
          methods.take_any_process_to_kill(CPU, process_name);// in one real world i mean ( linux Systems ) would be like sudo kill -9 PID
          
          
          
          
          
    }
    
}
