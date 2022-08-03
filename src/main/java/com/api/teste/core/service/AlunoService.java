package com.api.teste.core.service;

import com.api.teste.core.domain.dto.AlunoRequest;
import com.api.teste.core.domain.dto.AlunoResponse;
import com.api.teste.core.domain.entity.Aluno;
import com.api.teste.core.mapper.AlunoMapper;
import com.api.teste.core.persistence.repository.aluno.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public AlunoResponse createAluno(AlunoRequest request){
        Aluno entity = AlunoMapper.createAlunoFromRequest(request);
        alunoRepository.save(entity);

        AlunoResponse response = AlunoMapper.createAlunoResponseFromRequest(request);
        return response;
    }
}
