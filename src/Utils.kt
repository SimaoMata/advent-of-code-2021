import java.io.File

/**
 * Reads lines from the File to Int
 */
fun readInputToInt(name: String) = File("src", "input_files/$name.txt").readLines().map { it.toInt() }

/**
 * Reads lines from the File
 */
fun readInput(name: String) = File("src", "input_files/$name.txt").readLines()

