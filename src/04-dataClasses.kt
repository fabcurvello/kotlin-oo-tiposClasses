// https://play.kotlinlang.org/byExample/03_special_classes/01_Data%20classes

// Data Classes

data class User(val name: String, val id: Int) {           // 1
    override fun equals(other: Any?) =
        other is User && other.id == this.id  // 2 - Sobrescreveu o equals para orientar que a comparação de objetos se dá apenas pelo id
}
fun main() {
    val user = User("Alex", 1)
    println(user) // 3 - As data classes já entregam um toString total

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)
    val forthUser = User("Ana", 1)

    println("user == secondUser: ${user == secondUser}") // true
    println("user == thirdUser: ${user == thirdUser}")  // false
    println("user == fourthdUser: ${user == forthUser}") // true - por conta do id (comentario 2)

    /*
        Em Kotlin, assim como em Java, o método hashCode() é utilizado para retornar
        um valor de hash (um número inteiro) que é utilizado para identificar de
        forma única um objeto em estruturas de dados baseadas em tabelas de hash,
        como HashMap, HashSet, entre outras.
     */


    // hashCode() function - Aquele código de local de memória
    println(user.hashCode())                               // 5
    println(secondUser.hashCode())
    println(thirdUser.hashCode())
    println(forthUser.hashCode()) // não é o mesmo do user, pois não são o mesmo objeto

    // copy() function
    println(user.copy())  // 6 - Cria uma nova instância com outras referências
    println(user === user.copy()) // 7 === compara referência (end memória) -> false
    println(user.copy("Silvio")) // 8 faz a cópia mudando de Alex p Silvio (Como não identificou o atributo, foi pelo primeiro que é name)
    println(user.copy(id = 8)) // 9 faz a cópia mudando o id para 8

    println("name = ${user.component1()}") // 10 - atributos pela ordem de declaração
    println("id = ${user.component2()}")
}