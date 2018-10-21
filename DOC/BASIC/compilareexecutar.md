### Compilando e executando Scripts Groovy

#### Para compilar:

Para compilar um script groovy, usamos:

***groovyc Person.groovy*** - Compila a classe Person para Person.class (bytecode Java);

***groovyc .groovy*** - Compila todos os scripts do diretorio atual para .class;

#### Para executar:

***groovy script.groovy*** - executa o script em groovy;

***OBS: Para executar um script groovy, sempre precisamos compila-lo antes 
com o comando groovc***

#### Executando um script groovy com o linux (Shebang)

[O que é Shebang ?](https://bash.cyberciti.biz/guide/Shebang)

 Para fazer com que um script groovy seja executado como um script linux devemos seguir os seguintes passos: 
 - Colocamos o br.com.felipe.groovypoc.basic.shebang #!/usr/bin/env groovy
 - Damos permissão de execução chmod +x script.groovy
 - Executamos ./script.groovy

[Exemplo Shebang](../src/shebang.groovy)

