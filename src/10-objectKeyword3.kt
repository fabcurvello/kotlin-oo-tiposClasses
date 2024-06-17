// https://play.kotlinlang.org/byExample/03_special_classes/04_Object


// object Declaration
/*
Você também pode usar a declaração do objeto. Não é uma expressão e não pode ser
usada em uma atribuição de variável. Você deve usá-lo para acessar diretamente
seus membros:
 */

object DoAuth {                                                 //1
    fun takeParams(username: String, password: String) {        //2
        println("input Auth parameters = $username:$password")
    }
}

fun main(){
    DoAuth.takeParams("foo", "qwerty")                          //3
}