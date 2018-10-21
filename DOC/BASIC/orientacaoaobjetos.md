# Orientação a Objetos em Groovy

### Classes em Groovy

O modelo de uma classe em groovy é muito parecido com Java.

Exemplo 1: [Exemplo de classe 1](/br/com/felipe/groovypoc/classes/User.groovy)
Exemplo 2: [Exemplo de classe 2](/br/com/felipe/groovypoc/classes/Tweet.groovy)

Algumas diferenças que valem a pena ser ressaltadas:

- Toda classe é public por default;
- Todos os atributos são private por default;
- Todos os métodos são public por default;
- Os Getters And Setters são gerados automaticamente;
- A anotação @ToString em cima da classe gera o método ToString;
- Atributos podem ser def (podem ser de qualquer tipo) e métodos podem retornar def (retornar qualquer coisa). Isso representa a tipagem dinâmica do groovy;
- Uma classe não precisa possuir o mesmo nome do arquivo ao contrário de Java. Exemplo: [Script que contém uma classe](/twitter.groovy) 


 