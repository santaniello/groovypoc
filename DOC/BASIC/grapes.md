# Usando Grapes

Exemplo de uso do Grapes (Gerenciador de dependências do Groovy).

```groovy

@Grapes(
    @Grab(group = 'org.apache.commons',module = 'commons-lang3',version = '3.4')
)

String name = "Felipe Santaniello"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)

```

Links Úteis:

[Dependency management with Grape](http://docs.groovy-lang.org/latest/html/documentation/grape.html)


