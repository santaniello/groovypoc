#!/usr/bin/env groovy
package br.com.felipe.groovypoc.basic

/**
* Podemos fazer com que um script groovy seja executado com um script linux (br.com.felipe.groovypoc.basic.shebang que seria #!)
* - Colocamos o br.com.felipe.groovypoc.basic.shebang #!/usr/bin/env groovy
* - Damos permissão de execução chmod +x script.groovy
* - Executamos ./script.groovy
*
*
*  No exemplo abaixo, nós recebemos um comando linux e executamos e depois printamos a saida via groovy...
*
*
**/

def sout = new StringBuilder(), serr = new StringBuilder()
def proc = this.args[0].execute()
proc.consumeProcessOutput(sout, serr)
proc.waitForOrKill(1000)
println "out> $sout err> $serr"

//def command = this.args[0]




