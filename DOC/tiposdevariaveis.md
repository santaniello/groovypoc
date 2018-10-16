# Tipos de Variáveis

### Trabalhando com Numbers

Ao contrário do Java, no Groovy nós não temos os tipos primitivos, somente
os tipos Wrapper (Integer, Double, Float ,BigInteger, BigDecimal e etc...)

Exemplo - 1:

```groovy 
print 1.getClass().getName()
```

O print vai ser:

```groovy 
java.lang.Integer
```

Exemplo - 2:

```groovy 
print 15454518515108121811.getClass().getName()
```

O print vai ser:

```groovy 
java.lang.Long
```

Mesmo se tentarmos criar um tipo primitivo:

```groovy 
int x = 1
print x.class
```

O print vai ser:

```groovy 
java.lang.Integer
```
