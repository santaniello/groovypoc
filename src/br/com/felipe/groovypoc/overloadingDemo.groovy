package br.com.felipe.groovypoc

import br.com.felipe.groovypoc.classes.Account

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)

BigDecimal total = checking + savings
println total