package br.com.felipe.groovypoc.collections

import javafx.collections.transformation.SortedList

// Por default, uma lista é um ArrayList...
java.util.List arrayList  = [1, 2, 3, 4, 5, 6, 7, 8,9]
println arrayList.class.name


// Inicializando um LinkedList
java.util.List linkedList  = [1, 2, 3, 4, 5, 6, 7, 8.9] as LinkedList
println linkedList.class.name

// Inserindo valores em uma lista
arrayList.add(10) // Insere no Final
arrayList.push(99) // Insere no Inicio
arrayList.putAt(3,77) // Insere no Indice 3
arrayList[1] = 105 // Insere no Indice 1
arrayList << 6666 // Uma nova forma de adicionar valores a lista

println arrayList

java.util.List arrayList2  = [658,78]

// concatenando 2 arrays lists
println arrayList + arrayList2

// removendo itens
arrayList.pop() // remove o primeiro
arrayList.removeAt(0) // remove no indice 0
def newList = arrayList - 5 // subtrai o 5 elemento
println arrayList
println newList

// Buscando elementos na lista com Range

println arrayList.getAt(1..4) // retorna um range com os elementos do indice 1 ao 4

arrayList << [3,4,5]
arrayList << [1,1,2]

println arrayList
println arrayList.flatten().unique() // colocando as 2 listas adicionadas acima no mesmo nível e removendo elementos repetidos....

def number = [1,1,1,2,3,4,5,8,9,6,1,4,0] as SortedSet // Criando um Set Ordenado (TreeSet)
println number
println number.class.name

// limpando uma lista

arrayList.clear()
arrayList = []



