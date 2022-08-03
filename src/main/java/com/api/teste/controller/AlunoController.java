package com.api.teste.controller;

import com.api.teste.core.domain.dto.AlunoRequest;
import com.api.teste.core.domain.dto.AlunoResponse;
import com.api.teste.core.service.AlunoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/aluno")
public class AlunoController {
    @Autowired
    AlunoService alunoService;

    @Operation(
        summary = "Create a new Aluno",
        description = "Create a new Aluno"

    )
    @PostMapping(
            value = "/create",
            consumes = "application/json",
            produces = "application/json"
            )
    public AlunoResponse create(
            @RequestBody AlunoRequest alunoRequest,
            HttpServletResponse servletResponse


    ){
        AlunoResponse alunoResponse = new AlunoResponse();
        try {
            alunoResponse = alunoService.createAluno(alunoRequest);
        }catch (Exception ex) {
            servletResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }

        return alunoResponse;
    }
}
