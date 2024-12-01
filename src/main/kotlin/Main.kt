package org.kotlinlang

fun main() {
    val properties = System.getProperties()
    val sorted = properties.toSortedMap{ p1, p2 -> p1.toString().compareTo(p2.toString()) }
    sorted.forEach { (key, value) -> println("$key : $value") }

    println("\nKotlinVersion: " + KotlinVersion.CURRENT)
}
