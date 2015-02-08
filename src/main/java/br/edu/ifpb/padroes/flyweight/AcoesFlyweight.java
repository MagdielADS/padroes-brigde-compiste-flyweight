/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Magdiel Ildefonso
 */
public class AcoesFlyweight {

    private static Map<String, Acao> acoes = new HashMap<>();

    static {
        acoes.put("pular", new Pular());
        acoes.put("rolar", new Rolar());
        acoes.put("direita", new Direita());
        acoes.put("esquerda", new Esquerda());
    }

    public static Acao get(String nome) {
        return acoes.get(nome);
    }
}
