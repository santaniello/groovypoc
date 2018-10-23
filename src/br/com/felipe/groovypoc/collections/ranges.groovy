package br.com.felipe.groovypoc.collections

// Estamos especificando um intervalo de 1 à 10

Range r = 1..10
println r
println r.class.name
println r.from
println r.to

assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

// verificando o range de 1 à 9
assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

/* Trabalhando com ranges de datas */

Date today = new Date()
Date oneWeekAway = today + 7

println today
println oneWeekAway

Range days = today..oneWeekAway
println days

/* Trabalhando com ranges de letras */

Range letters = 'a'..'z'
println letters