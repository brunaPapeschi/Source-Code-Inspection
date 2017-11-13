/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.mackenzie.es.ticketmachine.core;

public class Ticket {
    private float preco;
    
    public Ticket(float preco){
        this.preco = preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
    
    
}
