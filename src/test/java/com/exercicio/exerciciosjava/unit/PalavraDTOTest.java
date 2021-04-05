package com.exercicio.exerciciosjava.unit;

import com.exercicio.exerciciosjava.service.dto.PalavraDTO;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import static org.junit.Assert.*;


public class PalavraDTOTest {

    @Test
    public void testSetPalavraOrdenada()
    {
        PalavraDTO p = new PalavraDTO();
        p.setPalavraOrdenada("amor");
        assertEquals("amor", p.getPalavraOrdenada());
    }

    @Test
    public void testSetPalavraOriginal()
    {
        PalavraDTO p = new PalavraDTO();
        p.setPalavraOriginal("ramo");
        assertEquals("ramo", p.getPalavraOriginal());
    }
}
