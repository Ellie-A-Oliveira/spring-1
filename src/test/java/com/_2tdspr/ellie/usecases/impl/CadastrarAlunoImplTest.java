package com._2tdspr.ellie.usecases.impl;

import com._2tdspr.ellie.domains.Aluno;
import com._2tdspr.ellie.usecases.CadastrarAluno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarAlunoImplTest {
    CadastrarAluno cadastrarAluno = new CadastrarAlunoImpl();

    @Test
    @DisplayName("Testa se as informações do objeto alunoASerCadastrado foram devidamente copiadas para um novo objeto")
    public void testExecutaDeCadastrarAluno() {
        Aluno alunoASerCadastrado = new Aluno();
        alunoASerCadastrado.setPrimeiroNome("Ellie");
        alunoASerCadastrado.setSobrenome("de Oliveira");
        alunoASerCadastrado.setDocumento("123.456.789-10");
        alunoASerCadastrado.setRegistro("12345");

        Aluno cadastrado = cadastrarAluno.executar(alunoASerCadastrado);

        Assertions.assertEquals(alunoASerCadastrado.getPrimeiroNome(), cadastrado.getPrimeiroNome());
        Assertions.assertEquals(alunoASerCadastrado.getSobrenome(), cadastrado.getSobrenome());
        Assertions.assertEquals(alunoASerCadastrado.getDocumento(), cadastrado.getDocumento());
        Assertions.assertEquals(alunoASerCadastrado.getRegistro(), cadastrado.getRegistro());
    }
}