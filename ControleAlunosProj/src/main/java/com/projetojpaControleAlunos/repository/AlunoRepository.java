package com.projetojpaControleAlunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpaControleAlunos.entities.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno, Long>{

}
