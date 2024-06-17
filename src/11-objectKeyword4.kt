// https://play.kotlinlang.org/byExample/03_special_classes/04_Object

// Companion Objects
/*
    Uma declaração de objeto dentro de uma classe define outro caso útil:
    o objeto complementar. Sintaticamente é semelhante aos métodos estáticos em Java:
    você chama os membros do objeto usando seu nome de classe como qualificador.
    Se você planeja usar um objeto complementar em Kotlin, considere usar uma função
    em nível de pacote.
 */

class BigBen {                                  //1
    companion object Bonger {                   //2
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(4)                         //4
}