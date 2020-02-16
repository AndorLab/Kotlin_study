package com.kotlin.kt04

fun main(vararg args: String): Unit {
    args.flatMap {
        it.split("_", ",")
    }.map { print("$it ") }
}
