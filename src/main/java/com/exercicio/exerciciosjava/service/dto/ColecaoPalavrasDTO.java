package com.exercicio.exerciciosjava.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ColecaoPalavrasDTO implements Serializable {

    private List<String> anagramas = new ArrayList<>();

    private List<String> naoAnagramas = new ArrayList<>();

}
