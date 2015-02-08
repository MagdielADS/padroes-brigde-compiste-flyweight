/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.padroes.brigde;

import br.edu.ifpb.padroes.beans.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Magdiel Ildefonso
 */
public class LoaderWeb {
    public static void main(String[] args) {
        List<Autor> autores = new ArrayList<>();
        Autor autor = new Autor();
        autor.setContato("autor@mail.com");
        autor.setFormacao("Pós-graduado");
        autor.setNome("Marcos Luiz");
        autores.add(autor);
        String conteudo = "Java é o poder";

        Editora editora = new Blog();

        ArtigoWeb artigo = new ArtigoWeb(autores, conteudo, editora);

        artigo.criarArtigo();
    }
}
