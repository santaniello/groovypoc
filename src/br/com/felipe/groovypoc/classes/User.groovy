package br.com.felipe.groovypoc.classes

import groovy.transform.ToString

/*
   Uma classe é publica por default...
*/
@ToString // Substitui o método to String do Java...
class User {
    /*
       Todos os modificadores de acesso de atributos são private por default
    */
    Long id
    String firstName
    String lastName
    String email
    Date dob

    /*
       Todos os modificadores de acesso de métodos são public por default
    */
    void printFullName(){
        print "FirstName : $firstName LastName : $lastName"
    }

    /*
       Construtores são criados dinâmicamente
       Exemplo: User user = new User(firstName:"Felipe", lastName:"Santaniello")
    */

    /*
       Getters and Setters são gerados dinâmicamente....
    */
}
