package com.api.teste.core.persistence.repository.aluno;

import com.api.teste.core.domain.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
