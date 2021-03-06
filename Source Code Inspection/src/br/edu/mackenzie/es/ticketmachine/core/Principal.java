/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.mackenzie.es.ticketmachine.core;

import br.edu.mackenzie.es.ticketmachine.exception.PapelMoedaInvalidaException;

/**
 *
 * @author Vmix
 */
public class Principal {
    public static void main(String[] args)  throws PapelMoedaInvalidaException{
       int opcao;
       
       do{
           opcao = Tela.menu();
           
           switch(opcao){
               case 0: 
                   opcao = 0;
                   break;
               case 1:
                   PapelMoeda moeda = new PapelMoeda(Tela.opcaoDepositar(), 1);
                   if (TicketMachine.isPapelMoedaValida(moeda.getValor())) {
                       TicketMachine.inserir(moeda.getValor());
                       Tela.sucessoDeposito();
                   }else{
                       Tela.erroDeposito();
                   }
                   break;
               case 2:
                   Ticket ticket = new Ticket(3);
                   
                   if (ticket.getPreco() > TicketMachine.getSaldo()) {
                        Tela.exibeMensagem("Saldo insuficiente");
                    } else {
                        Tela.imprimir(ticket.getPreco());
                        TicketMachine.saque(ticket.getPreco());
                    }

                   break;
               case 3:
                   Tela.exibeMensagem(" O saldo é " + TicketMachine.getSaldo());
                   break;
               case 4:
                   if (TicketMachine.getSaldo() == 0){
                       Tela.exibeMensagem("Não há troco!");
                   }else{
                       Tela.exibeMensagem("O valor do troco é" + TicketMachine.getSaldo());
                   }
                   break;
               default:
                   Tela.erroMenu();
                   opcao = 0;
                   break;
           }
       }while(opcao != 0);
       
       Tela.opcaoSair();
    }
}
