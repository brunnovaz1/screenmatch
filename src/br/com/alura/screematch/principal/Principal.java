package br.com.alura.screematch.principal;

import br.com.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screematch.calculos.FiltroRecomendacao;
import br.com.alura.screematch.modelos.Episodio;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão",2023);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();
        System.out.println("Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota: " + meuFilme.pegaMedia());
        System.out.println("- - - - - - - - - - - - - - - - - ");

        Filme meuFilme2 = new Filme("Avatar", 1999);
        meuFilme2.setDuracaoEmMinutos(200);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);

        System.out.println("Lista de FIlmes: " + listaDeFilmes.size());
        System.out.println("Filme 1 - " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());


        Serie lost = new Serie("Lost",2000);
        lost.setTemporadas(10);
        lost.setEpiosodioPorTemporada(10);
        lost.setMinutoPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração Total: " + lost.getDuracaoEmMinutos() + " min");


        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(meuFilme2);
        calc.inclui(lost);

        System.out.println("Tempo Lista: " + calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}
