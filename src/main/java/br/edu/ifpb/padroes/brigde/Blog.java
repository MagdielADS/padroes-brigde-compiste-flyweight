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
public class Blog implements Editora {

    @Override
    public void editaArtigo(Map<String, Object> informacoes) {
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println("<title>Publicação</title>");
        System.out.println("</head>");
        System.out.println("<body>");

        System.out.println("<h1>ARTIGO CIENTÍFICO</h1>");

        for (Autor autor : (List<Autor>) informacoes.get("autores")) {
            System.out.println("<h2>Autor: " + autor.getNome() + "</h2>");
            System.out.println("<h4>Formação: " + autor.getFormacao() + "</h4>");
            System.out.println("<h4>Contato: " + autor.getContato() + "</h4>");
        }

        System.out.println("<p>Conteudo: " + informacoes.get("conteudo") + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
