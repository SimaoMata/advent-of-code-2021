fun main() {
    val valuesList: List<String> = readInput("Day03")

    val answer1 = part1(valuesList)
    println(answer1)

    //1131506

    //val answer2 = part2(valuesList)
    //println(answer2)
}

private fun part1(input: List<String>): Int {
    val nrOfBits = input[0].length
    val hashMap: HashMap<Int, Int> = HashMap()
    var onesCounter: Int
    input.forEach {
        for (i in 0 until nrOfBits) {
            onesCounter = hashMap.getOrDefault(i, 0)
            if (it[i] == '1') hashMap[i] = onesCounter + 1
            else if (it[i] != '0') println("Character ${it[i]} not recognized.")
        }
    }
    val gammaRateString = getMostCommonBitsNumberFromTheMap(hashMap, input.size)
    val epsilonRateString = invertBits(gammaRateString)

    val gammaRate = bitToInt(gammaRateString)
    val epsilonRate = bitToInt(epsilonRateString)

    return gammaRate * epsilonRate
}

private fun getMostCommonBitsNumberFromTheMap(hashMap: HashMap<Int, Int>, length: Int): String {
    var bits = ""
    for (i in 0 until hashMap.size) {
        bits +=
            if (hashMap.getOrDefault(i, 0) > length / 2) '1'
            else '0'
    }
    return bits
}

private fun invertBits(from: String): String {
    return from.map { if (it == '0') '1' else '0' }.joinToString("")
}

private fun bitToInt(from: String) = Integer.parseInt(from, 2)

private fun part2(input: List<String>): Int {
    return 0
}