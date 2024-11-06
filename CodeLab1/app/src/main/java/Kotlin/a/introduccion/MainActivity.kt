package Kotlin.a.introduccion

fun main() {
    println(greatings("Juan"))
}

fun greatings(name: String): String {
    return "Hola ${name}"
}
