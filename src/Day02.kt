fun main() {
    val valuesList: List<String> = readInput("Day02")

    val answer1 = part1(valuesList)
    println(answer1)

    val answer2 = part2(valuesList)
    println(answer2)
}

private fun part1(input: List<String>): Int {
    var xPos = 0
    var depth = 0
    input.forEach { line ->
        val values: List<String> = line.split(' ')
        val direction = values[0]
        val units = values[1].toInt()
        when (direction) {
            "forward" -> xPos += units
            "up" -> depth -= units
            "down" -> depth += units
            else -> println("Direction \"$direction\" not recognized, will be ignored.")
        }
    }
    return xPos * depth
}


private fun part2(input: List<String>) : Int {
    var xPos = 0
    var depth = 0
    var aim = 0
    input.forEach { line ->
        val values: List<String> = line.split(" ")
        val direction = values[0]
        val units = values[1].toInt()
        when (direction) {
            "forward" -> {
                xPos += units
                depth += aim * units
            }
            "up" -> aim -= units
            "down" -> aim += units
            else -> println("Direction \"$direction\" not recognized, will be ignored.")
        }
    }
    return xPos * depth
}