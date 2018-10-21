package br.com.felipe.groovypoc.basic
// note that unlike Java and more like Ruby or Scala == is equality
assert 1 == 1

// like the example above  we are evaluating an expression
def x = 1
assert x == 1

// what happens when the expression doesn't evaluate to true?
assert false

// The power assertion output shows evaluation results from the outer to the inner expression
assert 1==2

// complex debig output
assert 1 == (3+10) * 100 / 5 * 20


/*
* The power assertion statements true power unleashes  in complex Boolean statements,
* or statemnts with collections or other toSTring-enabled basic:
* */
def y = [1,2,3,4,5]
assert (y << 6) == [6,7,8,9,10]

