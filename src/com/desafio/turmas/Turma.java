package com.desafio.turmas;

import java.util.Arrays;

public class Turma {
    private String nome;
    private String[] materias;

    public Turma(String nome, String[] materias){
        this.nome = nome;
        this.materias = materias;
    }

    public String getNome() {
        return nome;
    }

    public String[] getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return " Turma: '" + nome + "'";
    }
}
