/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Magdiel Ildefonso
 */
public class PlacaMae extends Componente {

    List<Componente> componentes = new ArrayList<>();

    @Override
    public String getNome() {
        String nome = "";
        for (Componente componente : componentes) {
            nome += componente.getNome() + ", ";
        }
        return nome;
    }

    @Override
    public void adicionar(Componente componente) {
        componentes.add(componente);
        System.out.println(componente.getNome() + " foi adicionado");
    }
}
