package calculator

import camp.nextstep.edu.missionutils.Console

fun main() {
    println("덧셈할 문자 열을 입력해 주세요.")
    val input = Console.readLine()

    var separator = ","
    if(input.startsWith("//")) {
        separator = input.substring(2,input.indexOf("\\n"))
    }
    println("결과 : $separator")
}