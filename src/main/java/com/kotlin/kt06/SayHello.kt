package com.kotlin.kt06

enum class Lang(val hello: String) {
    ENGLISH("Hello"),
    CHINESE("你好"),
    JAPANESE("日语你好"),
    KOREAN("韩语");

    fun sayHello() {
        println(hello)
    }

    companion object {
        fun parse(name: String): Lang {
            var valueOf = Lang.valueOf(name.toUpperCase())
            print(valueOf.ordinal)
            println(valueOf.name)
            println(Lang.values().contains(valueOf))
            println(enumValues<Lang>().joinToString { it.name })
            return Lang.valueOf(name.toUpperCase())
        }
    }

}

fun Lang.sayBye() {
    val bye = when (this) {
        Lang.ENGLISH -> "Bye"
        Lang.CHINESE -> "再见"
        Lang.JAPANESE -> "日语再见"
        Lang.KOREAN -> "韩语再见"
        else -> "unknown"
    }
    println(bye)
}

fun main(vararg args: String) {
    if (args.isEmpty()) return
    val lang = Lang.parse(args[0])
    lang.sayHello()
    lang.sayBye()
}
