package br.com.felipe.groovypoc.closures

List favNums = [2,21,44,35,8,4]

// percorrendo coleção sem clousure
for(num in favNums) {
    println num
}

// percorrendo coleção com clousure
favNums.each { println it }

// Obtendo indice de uma coleção sem closure
for( int i=0; i<favNums.size(); i++){
    println "$i:${favNums[i]}"
}

// Obtendo indice de uma coleção com closure
favNums.eachWithIndex { num, idx ->
    println "$idx:$num"
}

// findAll
List days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
List weekend = days.findAll { it.startsWith("S") }

println days
println weekend

// collect
List nums = [1,2,2,7,2,8,2,4,6]

// Imputando valores em uma nova collection sem clousure
List numsTimesTen = []
nums.each { num ->
    numsTimesTen << num * 10
}
// Imputando valores em uma nova collection com clousure
List newTimesTen = nums.collect { num -> num * 10 }

println nums
println numsTimesTen
println newTimesTen