# Estruturas de Controle

### IF / ELSE

```groovy 
if(true)
   println "value is true"
```

```groovy 
if(!false)
   println "value is false"
```

```groovy
String name = "Dan" 
if(name)
   println "name has a value"
```

```groovy
String last = "" 
if(last)
   println "last has a value"
```

```groovy
def x = 5
if(x==10){
    println "x is 10"
} else{
    println "x is NOT 10"
}    
```


### Laços de Repetição

##### While

```groovy
def i = 1
while(i<=10){
    println i
    i++
}    
```

##### FOR

```groovy
def list = [1,2,3,4]
for(num in list){
    println num
}
```

### Switch Case

```groovy
def myNumber = 1
switch(myNumber){
    case 1:
        println "number is 1"
        break
    default:
        println "We hit the default case"
}
```

