package calculator

import camp.nextstep.edu.missionutils.Console

fun main() {
    println("덧셈할 문자 열을 입력해 주세요.")
    val input = Console.readLine()
    val separators = mutableListOf(",",":")
    var numberpart = input
    var separator = ","

    try {
        if (input.startsWith("//")) {
            separator = input.substring(2, input.indexOf("\\n"))
            separators.add(separator)
            numberpart = input.substring(input.indexOf("\\n") + 1)
        }

        val numbers = numberpart.split(*separators.toTypedArray())
            .map { it.toInt() }
        val result = numbers.sum()

        println("결과 $result")
    } catch (e: Exception){
        throw IllegalArgumentException()
    }
}