// https://play.kotlinlang.org/byExample/03_special_classes/02_Enum

/*
    As classes Enum são usadas para modelar tipos que representam um conjunto finito de
    valores distintos, como direções, estados, modos e assim por diante.
 */

enum class State {
    IDLE, RUNNING, FINISHED                           // 1
}

fun main() {
    val state = State.RUNNING                         // 2
    val message = when (state) {                      // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}

