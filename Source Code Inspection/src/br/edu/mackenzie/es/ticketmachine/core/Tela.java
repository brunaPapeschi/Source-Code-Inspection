/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.mackenzie.es.ticketmachine.core;

import javax.swing.JOptionPane;

public class Tela {
    public static int menu(){
        
        String strMenu = " Ticket Machine - Emissão de Bilhetes \n"
                + " Selecione opção desejada: \n" 
                + " 1 - Depositar dinheiro \n"
                + " 2 - Emitir Bilhete  \n"
                + " 3 - Solicitar troco  \n"
                + " 0 - Sair  \n";
        
        return Integer.parseInt(JOptionPane.showInputDialog(null, strMenu));
    }
    
    public static int opcaoDepositar(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado: "));
    }
    
    public static void erroMenu(){
        JOptionPane.showMessageDialog(null, "A opção digitada é inválida!");
    }
    
    public static void opcaoSair(){
        System.exit(0);
    }
    
    public static void erroDeposito(){
        JOptionPane.showMessageDialog(null, "Nota inválida");
    }
    
    public static void sucessoDeposito(){
        JOptionPane.showMessageDialog(null, "Depósito realizado");
    }
    
    public static void exibeMensagem(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
