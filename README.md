# Curso Java COMPLETO: Do Zero ao Profissional + Projetos
```text
https://github.com/cod3rcursos/curso-java
```
## Packages
Todos os pacotes sao a extrutura de organizacao do programa.

Inferencia de tipos

```text
double a = 4.5;  // Forma explicita
var b = "Um texto";  // Forma por inferencia
```
## Tipos primtivos 
Nao possuem funcionalidades. Para um tipo primitivo ter funcoes, voce modifica para o um Wrapper.

6 = Numericos
Inteiros
- Byte  = 1 byte -> -128 ate +127;
- Short = 2 bytes -> 32.767
- Int = 4 bytes -> 2 milhoes
- Long = 8 bytes -> Muito grande
Ponto flutuante
- Float = 4 bytes. 
- Double = 8 bytes;
2 - Texto
- Char
- String
2 - Boolean
- True
- False

## Notacao ponto
```text
String s = "Bom dia";
System.out.println(s.uppercase)
```
A partir do ponto (s(ponto)uppercase) voce consegue acessar as novas funcionalidades a transformar esse dado.
```text
    String saudacao = "Bom dia X".replace("X", "Basilio");
    System.out.println(saudacao);
    saudacao = "Bom dia X".replace("X", "Basilio"). toUpperCase().concat("!!!");
    System.out.println(saudacao);
```

## Imports
Alguns pacotes precisam ser instanciados.
```text
import java.util.Date;
Date newDate = new Date();  // new Instancia um novo objeto.
```

## Wrapper
Sao a versao objeto (String) dos tipos primeitivos.