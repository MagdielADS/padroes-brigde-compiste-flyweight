/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.padroes.flyweight;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Magdiel Ildefonso
 */
public class LoaderJogo {
    public static void main(String[] args) {
        AcoesFlyweight acoes = new AcoesFlyweight();
        List<Acao> combo = Arrays.asList(
                acoes.get("pular"),
                acoes.get("rolar"),
                acoes.get("pular"),
                acoes.get("direita"),
                acoes.get("rolar"));

        System.out.println(combo);
    }
}
