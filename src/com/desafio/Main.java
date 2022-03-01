package com.desafio;

import com.desafio.pessoas.Alunos;
import com.desafio.pessoas.Professores;
import com.desafio.turmas.Turma;

public class Main {

    public static void main(String[] args) {


        Turma turma1 = new Turma("Java A", new String[]{"Orientação a objetos", "Lógica de programação", "Variáveis"});
        Turma turma2 = new Turma("JavaScript A", new String[]{"Banco de dados", "Elementos DOM", "Variáveis"});

        Professores professor = Professores.getInstance();

        professor.setNome("José");
        professor.setEspecialidade("Java");
        professor.setTurma(turma1);

        professor.registrar();

        professor.setNome("Maria");
        professor.setEspecialidade("JavaScript");
        professor.setTurma(turma2);

        professor.registrar();

        Alunos aluno1 = new Alunos("João", "54ABC", turma1);
        Alunos aluno2 = new Alunos("Giovanna", "52ABD", turma2);

        aluno1.registrar();
        aluno2.registrar();

        aluno1.imprimirListaAlunos();
        professor.imprimirLista();
    }
}
