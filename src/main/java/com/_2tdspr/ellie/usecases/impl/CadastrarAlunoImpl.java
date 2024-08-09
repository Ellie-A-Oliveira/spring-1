package com._2tdspr.ellie.usecases.impl;

import com._2tdspr.ellie.domains.Aluno;
import com._2tdspr.ellie.usecases.CadastrarAluno;

public class CadastrarAlunoImpl implements CadastrarAluno {
    @Override
    public Aluno executar(Aluno alunoParaSerCadastrado) {
        Aluno cadastrado = new Aluno();

        cadastrado.setPrimeiroNome(alunoParaSerCadastrado.getPrimeiroNome());
        cadastrado.setSobrenome(alunoParaSerCadastrado.getSobrenome());
        cadastrado.setDocumento(alunoParaSerCadastrado.getDocumento());
        cadastrado.setRegistro(alunoParaSerCadastrado.getRegistro());

        return cadastrado;
    }
}
