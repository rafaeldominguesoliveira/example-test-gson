# Como criar uma estrutura GSON dentro do projeto

## Tecnologias utilizadas

* Maven
* Java JDK 11+
* Lombok
* TestNG
* Gson

## Estrutura
O projeto foi estruturado para mostrar de maneira simples como funciona a utilização do GSON para converter Objetos Java para JSON e vice versa.

### src/main

#### dataproviders
A classe `DataProviderClass` possui a responsabilidade de prover quais dados serão utilizados como parâmetros nos testes.

#### dtos
Esta pasta contém as classes que irão receber e manipular as informações vindas do JSON.
Note que as classes `Order`, `Items` e `Customer`  possuem a anotação Lombok `@Data`. Essa anotação é responsável por criar os métodos _getters_ e _setters_ da classe.

#### utils
A classe `GsonUtils` é responsável por ler o arquivo JSON e transformá-lo em Objeto Java.

### src/test

#### gson
A classe `GsonTest` demonstra diversos testes com a utilização da biblioteca GSON.

#### resources/json_structures
Esta pasta tem por objetivo armazenar os arquivos JSON que serão utilizados nos testes do projeto. 

## Referências
* https://sites.google.com/site/aulasvictormenegusso/programacao-web-2-1-semestre-2017/trabalhando-com-json-com-a-biblioteca-gson
* https://haynes.blog.br/programacao/gson-trabalhando-com-json-em-java/
* https://github.com/google/gson