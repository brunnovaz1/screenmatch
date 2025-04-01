package br.com.alura.screematch.principal;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screematch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
            meuFilme.avalia(9);
        Filme meuFilme2 = new Filme("Avatar", 1999);
            meuFilme2.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
            filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(lost);

        for(Titulo item: lista) {
            System.out.println("Filme: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println(" - - - - - - - - - -  - - -");
            }
        }
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("Ordenação por Ano:");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
