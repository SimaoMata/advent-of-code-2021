import java.io.File

/**
 * Reads lines to Int
 */
fun readInputToInt(name: String) = File("src", "input_files/$name.txt").readLines().map { it.toInt() }

