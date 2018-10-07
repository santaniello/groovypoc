import br.com.felipe.groovypoc.classes.User

/* O def em um método ou variavel indica que ele pode ser qualquer coisa e podemos mudar o
   valor dele a qualquer momento durante a execução de um script...
   No caso de um método, indicamos que ele pode retornar qualquer coisa....
 */
def user = new User(firstName: "Felipe",lastName: "Santaniello")
user = "Mudei para String" // Mudamos o valor para uma string

/*
    No exemplo abaixo, a variavel user2 sempre vai ser do tipo User
 */
User user2 = new User(firstName: "Felipe",lastName: "Santaniello")

println user
println user2




