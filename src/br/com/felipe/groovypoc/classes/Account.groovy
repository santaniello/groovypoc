package br.com.felipe.groovypoc.classes

class Account {
    BigDecimal balance = 0.0
    String type

    void deposit(BigDecimal value){
        balance += value
    }

    void subtract(BigDecimal value){
        balance -= value
    }

    /**
     * Sobrescrevemos o método plus....
     * */
    BigDecimal plus(Account other){
       this.balance + other.balance
    }
}
