package com.exercicio.exerciciosjava.service;

import com.exercicio.exerciciosjava.service.dto.ColecaoPalavrasDTO;
import com.exercicio.exerciciosjava.service.dto.PalavraDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Service
public class ExercicioService {

    public boolean exercicioUm(String palavra1, String palavra2) {
        if (palavra1 == null) {
            palavra1 = "amor";
        }
        if (palavra2 == null) {
            palavra2 = "ramo";
        }

        char[] charPalavra1 = palavra1.toCharArray();
        char[] charPalavra2 = palavra2.toCharArray();

        Arrays.sort(charPalavra1);
        Arrays.sort(charPalavra2);

        return Arrays.equals(charPalavra1, charPalavra2);
    }

    public ColecaoPalavrasDTO exercicioDois(List<String> listaPalavras) {

        if (listaPalavras == null) {
            listaPalavras = Arrays.asList("amor", "roma", "ramo", "remo");
        }

        List<PalavraDTO> listaPalavrasDto = new ArrayList<>();
        Map<String, Integer> mapPalavrasOrdenadas = new TreeMap<>();

        preencherListaPalavrasOrdenadas(listaPalavras, mapPalavrasOrdenadas, listaPalavrasDto);

        List<String> anagramasPalavraOriginal = listaPalavrasDto.stream().filter(res -> mapPalavrasOrdenadas.get(res.getPalavraOrdenada()) > 1).map(PalavraDTO::getPalavraOriginal).collect(Collectors.toList());

        return new ColecaoPalavrasDTO(anagramasPalavraOriginal, listaPalavras.stream().filter(original -> anagramasPalavraOriginal.indexOf(original) < 0).collect(Collectors.toList()));
    }

    private void preencherListaPalavrasOrdenadas(List<String> listaPalavras, Map<String, Integer> mapPalavrasOrdenadas, List<PalavraDTO> listaPalavrasDto) {
        listaPalavras.forEach(palavra -> {
            char[] charPalavra = palavra.toCharArray();
            Arrays.sort(charPalavra);
            listaPalavrasDto.add(new PalavraDTO(new String(charPalavra), palavra));
            if (!mapPalavrasOrdenadas.containsKey(new String(charPalavra))) {
                mapPalavrasOrdenadas.put(new String(charPalavra), 0);
            }
            mapPalavrasOrdenadas.put(new String(charPalavra), mapPalavrasOrdenadas.get(new String(charPalavra)) + 1);
        });
    }


    public String exercicioTres(String palavra, String texto) {
        if (palavra == null) {
            palavra = "Exercicio";
        }
        if (texto == null) {
            texto = "[value] está resolvido";
        }
        return texto.replaceAll("(\\[\\w+\\])", palavra);
    }
}
