// https://play.kotlinlang.org/byExample/03_special_classes/04_Object
// Object Keyword
/*
    Classes e objetos em Kotlin funcionam da mesma maneira que na maioria das
    linguagens orientadas a objetos: uma classe é um projeto e um objeto é uma
    instância de uma classe. Normalmente, você define uma classe e depois cria
    múltiplas instâncias dessa classe:
 */

import java.util.Random

class LuckDispatcher {                    //1
    fun getNumber() {                     //2
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}
/*
Essa implementação abaixo não é muito interessante, pois estamos criando 2 objetos
para chamar o mesmo método construtor, que vai gerar um número aleatório.

Uma solução mais inteligente está no próximo exemplo (09...)
 */
fun main() {
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()

    d1.getNumber()                        //4
    d2.getNumber()
}

