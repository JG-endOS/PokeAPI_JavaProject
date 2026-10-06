package org.ticketsale;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int classificacaoIndicativa;
    private ArrayList<Sala> salas = new ArrayList<>();

    public Filme(String titulo, int classificacaoIndicativa){
        this.titulo = titulo;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public void adicionarSala(Sala s){
        salas.add(s);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
}
