package com.desafio.pessoas;

import com.desafio.turmas.Turma;

import java.util.*;

public class Alunos implements Pessoa{

    private String nome, rm, situacaoAtual;
    private Turma turma;
    private static Map<String, Turma> alunos = new TreeMap<>();

    public Alunos(String nome, String rm, Turma turma) {
        this.nome = nome;
        this.rm = rm;
        this.turma = turma;
    }

    @Override
    public void registrar() {
        if(alunos.containsKey(this.nome)){
            if (alunos.get(this.nome) == this.turma){
                System.out.println("Aluno já registrado no curso");
                return;
            } else{
                alunos.put(this.nome, this.turma);
                System.out.println("Aluno registrado com sucesso");
                situacaoAtual = "Matriculado";
            }
        } else{
            alunos.put(this.nome, this.turma);
            System.out.println("Aluno registrado com sucesso");
            situacaoAtual = "Matriculado";
        }


    }

    public void alterarSituacao(String situacao){
        String situacaoAnterior = this.situacaoAtual;
        this.situacaoAtual = situacao;
        System.out.println("Estado atual do aluno trocado de '" + situacaoAnterior + "' para '" + situacaoAtual + "'.");
    }

    public void imprimirListaAlunos(){
        System.out.println(alunos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", rm='" + rm + '\'' +
                ", situacaoAtual='" + situacaoAtual + '\'' +
                ", turma=" + turma +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return Objects.equals(nome, alunos.nome) && Objects.equals(rm, alunos.rm) && Objects.equals(situacaoAtual, alunos.situacaoAtual) && Objects.equals(turma, alunos.turma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, rm, situacaoAtual, turma);
    }
}
