package com.desafio.pessoas;

import com.desafio.turmas.Turma;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Professores implements Pessoa{

    private String nome, especialidade;
    private Turma turma;
    private static Set<Professores> listaProfessores = new HashSet<>();

    private static class instanceHolder{
        public static Professores instancia = new Professores();
    }

    private Professores(){
        super();
    }

    public static Professores getInstance(){
        return instanceHolder.instancia;
    }

    public void imprimirLista(){
        System.out.println(listaProfessores);
    }

    @Override
    public void registrar() {
        Professores professor = new Professores();
        professor.setNome(this.nome);
        professor.setEspecialidade(this.especialidade);
        professor.setTurma(this.turma);

        listaProfessores.add(professor);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professores that = (Professores) o;
        return Objects.equals(nome, that.nome) && Objects.equals(especialidade, that.especialidade) && Objects.equals(turma, that.turma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, especialidade, turma);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }
}
