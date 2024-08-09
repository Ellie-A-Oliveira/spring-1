package com._2tdspr.ellie.usecases.impl;

import com._2tdspr.ellie.domains.Professor;
import com._2tdspr.ellie.usecases.CadastrarProfessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarProfessorImplTest {
    CadastrarProfessor cadastrarProfessor = new CadastrarProfessorImpl();

    @Test
    @DisplayName("Testa se todas as propriedades do professorASerCadastrado são copiadas para o cadastrado")
    public void testExecutaDeCadastrarProfessor() {
        Professor professorASerCriado = new Professor();
        professorASerCriado.setPrimeiroNome("João");
        professorASerCriado.setSobrenome("Luís Veronezzi Pacheco");
        professorASerCriado.setDisciplina("Java Advanced");
        professorASerCriado.setDocumento("123.456.789-10");

        Professor cadastrado = cadastrarProfessor.executar(professorASerCriado);

        Assertions.assertEquals(professorASerCriado.getPrimeiroNome(), cadastrado.getPrimeiroNome());
        Assertions.assertEquals(professorASerCriado.getSobrenome(), cadastrado.getSobrenome());
        Assertions.assertEquals(professorASerCriado.getDisciplina(), cadastrado.getDisciplina());
        Assertions.assertEquals(professorASerCriado.getDocumento(), cadastrado.getDocumento());
    }
}