package com.exercicio.exerciciosjava.unit;

import com.exercicio.exerciciosjava.service.dto.ColecaoPalavrasDTO;
import com.exercicio.exerciciosjava.service.dto.PalavraDTO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class ColecaoPalavrasDTOTest {

    @Test
    public void testSetAnagramas()
    {
        ColecaoPalavrasDTO colecaoPalavrasDTO = new ColecaoPalavrasDTO();
        colecaoPalavrasDTO.setAnagramas(Arrays.asList("emor"));
        assertEquals(Arrays.asList("emor"), colecaoPalavrasDTO.getAnagramas());
    }

    @Test
    public void testSetNaoAnagramas()
    {
        ColecaoPalavrasDTO colecaoPalavrasDTO = new ColecaoPalavrasDTO();
        colecaoPalavrasDTO.setNaoAnagramas(Arrays.asList("emor"));
        assertEquals(Arrays.asList("emor"), colecaoPalavrasDTO.getNaoAnagramas());
    }
}
