package com.api.teste.core.mapper;

import com.api.teste.core.domain.dto.AlunoRequest;
import com.api.teste.core.domain.dto.AlunoResponse;
import com.api.teste.core.domain.entity.Aluno;

public class AlunoMapper {
    private AlunoMapper() {

    }
    public static Aluno createAlunoFromRequest(AlunoRequest alunoRequest){
        Aluno aluno =  new Aluno();
        aluno.setName(alunoRequest.getName());
        aluno.setLastName(alunoRequest.getLastName());
        aluno.setBirthDate(alunoRequest.getBirthDate());
        aluno.setClassroom(alunoRequest.getClassroom());

        return aluno;
    }
    public static AlunoResponse createAlunoResponseFromRequest(AlunoRequest alunoRequest){
        AlunoResponse aluno =  new AlunoResponse();
        aluno.setName(alunoRequest.getName());
        aluno.setLastName(alunoRequest.getLastName());
        aluno.setBirthDate(alunoRequest.getBirthDate());
        aluno.setClassroom(alunoRequest.getClassroom());

        return aluno;
    }
}
