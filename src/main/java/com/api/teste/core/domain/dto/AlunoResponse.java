package com.api.teste.core.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlunoResponse {
    private Long id;

    private String name;

    private String lastName;

//    private Date birthDate;

    private String classroom;
}
