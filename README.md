# Exercícios

Como a descrição do projeto estava aberta foi desenvolvido uma api dos exercícios utilizando spring. 

Todos os endpoints são get.

Os parâmetros das requisições são opcionais, caso algum campo não for passados, os campos daquela requisição serão preenchidos com os valores demonstrados nos exemplos.
Na pasta imagens contém imagens de como são montadas as requisições.

Antes de executar o backend, execute o seguinte comando:
```` Java
    $ mvn clean install
```` 

### Exercício um

O exercício um foi desenvolvido a partir da logica de transformar cada palavra em um array de char e ordernar esse array, e fazendo uma verificação se os arrays são iguais.

#####Exemplo para chamar endpoint
http://localhost:8080/api/exercicios/exercicio-um?palavra1=amor&palavra2=ramo

ou

http://localhost:8080/api/exercicios/exercicio-um 

### Exercício dois

O exercício dois foi desenvolvido a partir da logica de percorrer a lista passada, e transformar cada palavra da mesma, em um array de char ordenado. 
 Transformar o array de char em string e adicionar em uma lista com o objeto(PalavraDTO) chamado listaPalavrasDto que contém duas Strings uma com a palavra original(palavraOriginal) e outra com a palavra com as letras ordenadas(palavraOrdenada), 
também foi criado um Map<String, Interger>, tendo a palavra ordenada(palavraOrdenada) como key, e o value contendo o valor de vezes que a palavra se repetia.

Toda vez que adicionar uma palavra no qual já existe ele, faz um get e incrementa o value. 

Com o Map e a listaPalavrasDto preenchida é realizado um filter na listaPalavrasDto filtrando todas as palavras que contém o value do Map maior que 1, e utilizado o map do Stream para retornar
uma lista de palavras que são anagramas, e para palavras que não são anagramas é realizado um filter da lista enviada com a lista de anagramas.

E as duas lista são adicionadas em um novo objeto(ColecaoPalavrasDTO) para retorno.

#####Exemplo para chamar endpoint
http://localhost:8080/api/exercicios/exercicio-dois?listaPalavra=amor,roma,ramo,remo

ou

http://localhost:8080/api/exercicios/exercicio-dois 

### Exercício três

O exercício três foi desenvolvido a partir da logica de utilizar uma regex para substituir tudo que está entre [] no texto por palavra.

#####Exemplo para chamar endpoint

http://localhost:8080/api/exercicios/exercicio-tres?palavra=Exerc%C3%ADcio%203&texto=%5Bvalue%5D%20est%C3%A1%20resolvido

ou

http://localhost:8080/api/exercicios/exercicio-tres 


###Testes
Foram realizando testes de integração contendo 3 testes, um para cada função do resource, cada teste contém duas chamadas para o endpoint uma com os parâmetros preenchidos e o outro não. 
Também foi realizado testes unitários para testar getter e setter. 


