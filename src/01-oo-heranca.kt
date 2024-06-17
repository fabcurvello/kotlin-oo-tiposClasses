open class Dog {                // 1 - open para poder ser superclasse de outra classe
    open fun sayHello() {       // 2 - open para poder ser utilizada em uma subclasse
        println("wow wow!")
    }

    fun teste() {  // Função comum, segue de herança para a subclasse, mas não pode ser sobrescrita.
        println("Teste")
    }
}

class Yorkshire : Dog() {       // 3 - Herança. Subclasse!
    override fun sayHello() {   // 4 - Polimorfismo
        println("wif wif!")
    }

    // override fun teste() {}  -> ERRO
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
    dog.teste()
}