package br.com.felipe.groovypoc.closures

/**
 * Um closure é um objeto que pode ser passado como parâmetro...
 * */

// Inicializando um objeto do tipo Closure
def c = {}

println c.class.name
println c instanceof Closure

// Exemplo de Closure sem parâmetros
def sayHello = {
    println "Hello Closure"
}
sayHello()

// Exemplo de Closure com parâmetros (quando declaramos um parâmetro explicito, não conseguimos usar o parâmetro implicito it )
def sayHelloParameter = { name ->
    println "Hello, $name"
}

sayHelloParameter("Felipe")

// Percorrendo uma lista com Closures...

List nums = [1,4,7,4,30,2]
/* O closure tem um variável especial (parâmetro implicito) chamada it
   No exemplo abaixo usamos ela para exibir o valor de cada indice da lista...
*/

nums.each {
    println it
}

// No exemplo abaixo demos um nome a nossa variavel closure chamado num...
nums.each { num ->
    println num
}

/**
 * Closures são objetos e podem ser passados como parâmetros (sempre como o último parâmtro)
 * */
def timesTen(num,closure){
    closure(num*10)
}

timesTen(10, {println it})

// Outa forma de passarmos um closure como parâmetro (Lembrando que o Closure deve ser sempre passado com ultimo parâmetro)...
timesTen(2){
    println it
}


// Closures e numeros

10.times {
    println it // lembrando que o it é um parâmetro implicito
}

import java.util.Random

Random rand = new Random()

3.times {
    println rand.nextInt()
}


