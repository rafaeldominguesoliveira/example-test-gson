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

### enums
This package contains the Test Data Builder classes.
Both classes on this package use `UserRegister` object created with Lombok.

The `UserRegistrationFixedData` has all the methods to create different data but with fixed data, 
which means your tests will have the same data all the time.

The `UserRegistrationData` has all the methods to create different dynamic data. Faker is being used to generate the data.
Even though you use the same method twice in your test, the data will be different.

### utils
This package contains the Test Data Builder classes.
Both classes on this package use `UserRegister` object created with Lombok.

The `UserRegistrationFixedData` has all the methods to create different data but with fixed data, 
which means your tests will have the same data all the time.

The `UserRegistrationData` has all the methods to create different dynamic data. Faker is being used to generate the data.
Even though you use the same method twice in your test, the data will be different.

### src/test

#### gson
The class `PlainClassTest` shows how is the process to create a test with data to use in your test **in the regular way**.

The class `PlainClassUsingBuilderTest` shows how is the process to create a test with **data using a builder**.

### resources
Log4J2 properties files used to show the log information in the console.
Note that Log4J2 is being using directly on test classes `PlainClassTest`, `PlainClassUsingBuilderTest` and `UsingLombokBuilderTest` but when we 
start using a concrete example of the Test Data Builder the log is being used on these tests.

I created this approach to add the responsibility of the data longing in the right place: the place they are being generated.

## Referências
 * https://sites.google.com/site/aulasvictormenegusso/programacao-web-2-1-semestre-2017/trabalhando-com-json-com-a-biblioteca-gson
 * https://haynes.blog.br/programacao/gson-trabalhando-com-json-em-java/
 * https://github.com/google/gson
