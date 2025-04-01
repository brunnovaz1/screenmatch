package br.com.alura.screematch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int epiosodioPorTemporada;
    private int minutoPorEpisodio;
    private boolean ativa;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpiosodioPorTemporada() {
        return epiosodioPorTemporada;
    }

    public void setEpiosodioPorTemporada(int epiosodioPorTemporada) {
        this.epiosodioPorTemporada = epiosodioPorTemporada;
    }

    public int getMinutoPorEpisodio() {
        return minutoPorEpisodio;
    }

    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epiosodioPorTemporada * minutoPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoDeLancamento() +  ")" ;
    }
}
