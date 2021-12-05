fun main() {
    val valuesList: List<Int> = readInputToInt("Day01")

    val answer1 = part1(valuesList)
    println(answer1)

    val answer2 = part2(valuesList)
    println(answer2)
}

fun part1(input: List<Int>) = input.windowed(2).count { (first, second) -> first < second }


fun part2(input: List<Int>) =
    input.windowed(3).windowed(2).count { (firstGroup, secondGroup) -> firstGroup.sum() < secondGroup.sum() }