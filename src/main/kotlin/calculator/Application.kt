package calculator

import camp.nextstep.edu.missionutils.Console

fun main() {
    println("덧셈할 문자 열을 입력해 주세요.")
    val input = Console.readLine()
    val separators = mutableListOf(",",":")
    var numberPart = input
    var separator = ","

    try {
        if (input.startsWith("//")) {
            separator = input.substring(2, input.indexOf("\\n"))
            separators.add(separator)
            numberPart = input.substring(input.indexOf("\\n") + 2)
        }

        val numbers = numberPart.split(*separators.toTypedArray())
            .map {
                val num = it.toInt()
                if (num < 0) throw IllegalArgumentException()
                num
            }
        val result = numbers.sum()

        println("결과 : $result")
    } catch (e: Exception){
        throw IllegalArgumentException()
    }
}