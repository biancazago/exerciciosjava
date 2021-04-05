package com.exercicio.exerciciosjava.web.rest;

import com.exercicio.exerciciosjava.service.ExercicioService;
import com.exercicio.exerciciosjava.service.dto.ColecaoPalavrasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/exercicios")
public class ExercicioResource {

    private final ExercicioService exercicioService;

    @GetMapping("/exercicio-um")
    public ResponseEntity<Boolean> exercicioUm(@RequestParam(required = false) String palavra1, @RequestParam(required = false) String palavra2) {
        return new ResponseEntity<>(exercicioService.exercicioUm(palavra1, palavra2), HttpStatus.OK);
    }

    @GetMapping("/exercicio-dois")
    public ResponseEntity<ColecaoPalavrasDTO> exercicioDois(@RequestParam(required = false) List<String> listaPalavra) {
        return new ResponseEntity<>(exercicioService.exercicioDois(listaPalavra), HttpStatus.OK);
    }

    @GetMapping("/exercicio-tres")
    public ResponseEntity<String> exercicioTres(@RequestParam(required = false) String palavra, @RequestParam(required = false) String texto) {
        return new ResponseEntity<>(exercicioService.exercicioTres(palavra, texto), HttpStatus.OK);
    }

}
