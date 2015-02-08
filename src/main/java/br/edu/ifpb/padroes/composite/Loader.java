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
public class Loader {
    public static void main(String[] args) {
        DriverCd cd = new DriverCd("Driver Samsung");
        cd.adicionar(cd);
        PlacaMae placa = new PlacaMae();
        placa.adicionar(cd);
    }
}
