package com._2tdspr.ellie.usecases.impl;

import com._2tdspr.ellie.domains.Professor;
import com._2tdspr.ellie.usecases.CadastrarProfessor;

public class CadastrarProfessorImpl implements CadastrarProfessor {
    @Override
    public Professor executar(Professor professorASerCadastrado) {
        Professor cadastrado = new Professor();

        cadastrado.setPrimeiroNome(professorASerCadastrado.getPrimeiroNome());
        cadastrado.setSobrenome(professorASerCadastrado.getSobrenome());
        cadastrado.setDocumento(professorASerCadastrado.getDocumento());
        cadastrado.setDisciplina(professorASerCadastrado.getDisciplina());

        return cadastrado;
    }
}
