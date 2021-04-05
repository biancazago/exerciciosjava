package com.exercicio.exerciciosjava.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PalavraDTO implements Serializable {

    private String palavraOrdenada;

    private String palavraOriginal;

}