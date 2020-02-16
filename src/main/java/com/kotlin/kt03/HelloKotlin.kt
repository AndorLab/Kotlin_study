package com.kotlin.kt03

fun main(args: Array<out String>) {
    val user = User(0, null)
    println(user)
    val items = listOf<String>("apple", "banana", "kiiwf")

    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println(description(1L))

    val text = """
    for (c in "foo")
        print(c)
    """
    var arr = IntArray(5) { it * 2 }
    println(text)
    val ar1 = arrayOf(1,2,3)
    println(asList(1,2,3,4,5, *ar1))
    print(findFixPoint())
}

fun description(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

val eps = 1E-10
tailrec fun findFixPoint(x: Double = 1.0): Double
    = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))

