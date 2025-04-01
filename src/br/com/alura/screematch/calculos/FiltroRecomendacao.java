package br.com.alura.screematch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;


    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Está bem avaliado!");
        }else{
            System.out.println("Título no catálogo.");
        }
    }
}
