fun main(args: Array<String>) {
    println("Hello, World")

    val aSentence = "I'm a string"
    val myPi = 3.14
    val myAnswer = 42

    var myDouble = 1.999
    var myFloat = 1.9F
    var myLong = 123456789L
    var myInt = 199
    var myShort: Short = 12
    var myByte: Byte = 127

    val aLongNumber = 123_456_789
    val theseNumber = 123456789 //same number than aLongNumber

    val anInt: Int = 1
    val aLong: Long = anInt.toLong() //how to convert from int to long
    var myInt2: Int = aLongNumber.toInt()

    //int lowest = (a > b) ? a : b java example of a ternary

    val lowest = if (myInt < anInt) myInt else anInt
    println("the lowest value is: $lowest")

    val temp = 80
    val isAirConditionerOn = if (temp >= 80) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }

    println("It's the air conditioner on: $isAirConditionerOn")


    val burgersOrdered = 5

    when (burgersOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> {
            println("Are you sure?")
        }
    }
    // When(value) looks like a Switch

    when (burgersOrdered) {
        Math.abs(burgersOrdered) -> println("Ordered 0 or more burgers")
        else -> {
            println("Ordered les than 0")
        }
    }

    when (burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Not sure")
    }

    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }

    var x = 0

    while (x < 10) {
        println(x)
        x += 3
    }

    println("X = $x")

    do {
        println(x)

        x -= 3
    } while (x > 0)

    println("X = $x")

    for (i in 1..10) {
        //The index in this case I is immutable
        println(i)
    }

    for (ch in "biscuit") {
        println(ch)
    }

    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} $item")
    }

    for ((i, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("$i , $item")
    }

    val myArray = arrayOf(10, 20, 30, 40, 50)

    for (item in myArray.indices) {
        println("at index: $item in myArray is ${myArray[item]}")
    }

    println("10 + 20 = ${myFunction(10, 20)}")

}

fun myFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}