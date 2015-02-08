/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.padroes.composite;

/**
 *
 * @author Magdiel Ildefonso
 */
public abstract class Componente {
    String nome;

    public String getNome() {
        return nome;
    }
    
    public void adicionar(Componente componente){
        System.out.println("Esse é um componente simples, o mesmo não tem capacidade para receber outros componentes");
    }
}
