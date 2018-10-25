package br.com.felipe.groovypoc.collections

Map map = [:] // Inicializando um Map vazio
println map
println map.getClass().name

Map person  = [first:"Felipe",last:"Santaniello", email:"felipe.santaniello@gmail.com"]
println person
println person.first


def emailKey = "EmailAddress"
// OBS: Se não colocarmos () na chave emailKey, quando printarmos o mapa o valor da chave será emailKey ao invés de EmailAddress...
def twitter  = [username:"@therealfelipe",(emailKey):"felipe_sbc_sp@hotmail.com"]
println twitter

// percorrendo um Map

for(entry in person){
    println entry
}


for(key in person.keySet()){
    println "$key:${person[key]}"
}