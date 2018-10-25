package br.com.felipe.groovypoc.closures

// Usando parâmetro implicito...
def foo = {
    println it
}
foo('Felipe')

// Forçando um closure a não aceitar parâmetros...

def noParams = { ->
    println "noParams..."
}

// noParams(10) vai dar erro!
noParams()

// Closure com dois parâmetros...
def sayHello = {first, last ->
    println "Hello, $first $last"
}

sayHello("Felipe","Santaniello")


// Closure com default values ...
def greet= {String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}
greet("Dan","Hello")
greet("Joe")

// var arg
def concat = {String... args ->
    args.join('')

}

println concat('abc','def')
println concat('abc','def','123','456')


/*
* No exemplo abaixo, nós passamos uma closure para o método e verificamos a quantidade de parâmetros e os tipos de parâmetros...
* Isso é muito util quando queremos tomar uma decisão em tempo de execução baseado nos parâmetros que são passados
* através do Closure e executar uma ação específica....
*
* */
def someMethod(Closure c){
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes

}

def someClosure = {int x, int y -> x + y}
someMethod(someClosure)
