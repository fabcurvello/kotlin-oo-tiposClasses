// https://play.kotlinlang.org/byExample/03_special_classes/04_Object

// Object Keyword - object Expression

/*
    Aqui está um uso típico básico de uma expressão de objeto: uma estrutura simples de
    objeto/propriedades. Não há necessidade de fazer isso na declaração de classe:
    você cria um único objeto, declare seus membros e acesse-os dentro de uma função.
    Objetos como esse são frequentemente criados em Java como instâncias de classe anônimas.
 */
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {                                                     //2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

fun main() {
    rentPrice(10, 2, 1)                                                         //5
}