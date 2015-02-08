/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.padroes.brigde;

import br.edu.ifpb.padroes.beans.Autor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Magdiel Ildefonso
 */
public class ArtigoCientifico implements Artigo{
    public List<Autor> autores;
    public List<String> palavrasChaves;
    public String resumo;
    public String conteudo;
    private Editora editora;

    public ArtigoCientifico(List<Autor> autores, List<String> palavras, String resumo, String conteudo, Editora editora){
        this.autores = autores;
        this.palavrasChaves = palavras;
        this.resumo = resumo;
        this.conteudo = conteudo;
        this.editora = editora;
    }
    
    /**
     *Criar o artigo coloca todas as informações do artigo em Map, o mesmo será repassado para a instância
     *da Editora que public esse tipo de artigo, onde o mesmo será processado para o formato adequado.
     */
    @Override
    public void criarArtigo() {
        Map<String, Object> info = new HashMap<String, Object>();
        info.put("autores", autores);
        info.put("palavras", palavrasChaves);
        info.put("resumo", resumo);
        info.put("conteudo", conteudo);
        editora.editaArtigo(info);
    }
}
