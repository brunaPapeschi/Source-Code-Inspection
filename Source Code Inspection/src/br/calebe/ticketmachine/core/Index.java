/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
public class Index {
    
    public static void main(String[] args) {
      TicketMachine tM= new TicketMachine(4);
      
        System.out.println("Ticket Machine");
        System.out.println ("Opções : Inserir 1");
        System.out.println (" Troco 2");
        System.out.println (" Inserir 3 ");
        System.out.println ("Bilhete 4");
        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();
        
        switch(escolha){
            case 1:
                System.out.println("Valor do papel-moeda");
      int valor = scan.nextInt();
                ticketMachine.inserir(valor);
                System.out.println(ticketMachine.getSaldo());
                break;
            case 2:
                System.out.println("Seu troco será: ");
                break;
                
            case 3:
                System.out.println("Bilhete Impresso!");
                break;
            
        }

    }
    
}
