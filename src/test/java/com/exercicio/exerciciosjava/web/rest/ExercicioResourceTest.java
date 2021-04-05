package com.exercicio.exerciciosjava.web.rest;

import com.exercicio.exerciciosjava.util.IntTestComum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
public class ExercicioResourceTest extends IntTestComum {
    private static final String API_EXERCICIO = "/api/exercicios/";

    @Test
    void exercicioUm() throws Exception {
        getMockMvc().perform(get(API_EXERCICIO + "exercicio-um" + "?palavra1=amor&palavra2=ramo")).andExpect(status().isOk()).andReturn();
        getMockMvc().perform(get(API_EXERCICIO + "exercicio-um")).andExpect(status().isOk()).andReturn();
    }

    @Test
    void exercicioDois() throws Exception {
        getMockMvc().perform(get(API_EXERCICIO + "exercicio-dois" + "?listaPalavra=amor,roma,ramo,remo")).andExpect(status().isOk()).andReturn();
        getMockMvc().perform(get(API_EXERCICIO + "exercicio-dois")).andExpect(status().isOk()).andReturn();
    }

    @Test
    void exercicioTres() throws Exception {
        getMockMvc().perform(get(API_EXERCICIO + "exercicio-tres" + "?palavra=Exerc%C3%ADcio%203&texto=%5Bvalue%5D%20est%C3%A1%20resolvido")).andExpect(status().isOk()).andReturn();
        getMockMvc().perform(get(API_EXERCICIO + "exercicio-tres")).andExpect(status().isOk()).andReturn();
    }

}
