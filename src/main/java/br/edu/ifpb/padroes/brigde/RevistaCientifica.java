/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.padroes.brigde;

import br.edu.ifpb.padroes.beans.Autor;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Magdiel Ildefonso
 */
public class RevistaCientifica implements Editora{

    @Override
    public void editaArtigo(Map<String, Object> informacoes) {
        System.out.println("ARTIGO CIENTÍFICO");
        for (Autor autor : (List<Autor>) informacoes.get("autores")) {
            System.out.println("Autor: "+autor.getNome());
            System.out.println("Formação: "+autor.getFormacao());
            System.out.println("Contato: "+autor.getContato());
        }
        
        System.out.println("Resumo: "+ informacoes.get("resumo"));
        
        List<String> palavras = (List<String>)informacoes.get("palavras");
        String texto = "Palavras-chaves: ";
        for (String string : palavras) {
            texto += string+", ";
        }
        
        System.out.println(texto);
        System.out.println("Conteudo: "+informacoes.get("conteudo"));
    }
}
