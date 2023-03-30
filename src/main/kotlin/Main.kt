import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var score = 0
    var totalQuestions = 0
    var exit = false

    println("Welcome to the Kotlin Quiz!")
    print("Please enter your name: ")
    val name = scanner.nextLine()

    while (!exit) {
        println("\nChoose a category:")
        println("1. Numbers")
        println("2. Text")
        println("3. Selection")
        println("4. Trivia")
        println("5. Geography")
        println("6. Exit")
        print("Enter your choice: ")
        val choice = scanner.nextInt()
        scanner.nextLine()

        when (choice) {
            1 -> {
                println("\nQuestion 1: What is 40 x 10.5?")
                val answer = scanner.nextLine()
                totalQuestions++
                if (answer.trim() == "420") {
                    println("Correct!")
                    score++
                } else {
                    println("Incorrect.")
                }
            }
            2 -> {
                println("\nQuestion 2: On What Japanese City Was The First Atomic Bomb Dropped!")
                val answer = scanner.nextLine()
                totalQuestions++
                if (answer.trim().equals("Hiroshima", ignoreCase = true)) {
                    println("Correct!")
                    score++
                } else {
                    println("Incorrect.")
                }
            }
            3 -> {
                println("\nQuestion 3: Anubis, the God of Death, had the head of a…")
                println("A. Jackel")
                println("B. Falcon")
                println("C. Alligator")
                val answer = scanner.nextLine()
                totalQuestions++
                if (answer.trim().equals("A", ignoreCase = true)) {
                    println("Correct!")
                    score++
                } else {
                    println("Incorrect.")
                }
            }
            4 -> {
                println("\nQuestion 4: Which city in India would you find the Taj Mahal in")
                val answer = scanner.nextLine()
                totalQuestions++
                if (answer.trim().equals("Agra", ignoreCase = true)) {
                    println("Correct!")
                    score++
                } else {
                    println("Incorrect.")
                }
            }
            5 -> {
                println("\nQuestion 5: What is continent is Aruba in")
                val answer = scanner.nextLine()
                totalQuestions++
                if (answer.trim().equals("South America", ignoreCase = true)) {
                    println("Correct!")
                    score++
                } else {
                    println("Incorrect.")
                }
            }
            6 -> {
                exit = true
            }
            else -> {
                println("Invalid choice. Please enter a number from 1 to 4.")
            }
        }
    }

    val percentage = score.toDouble() / totalQuestions * 100
    println("\n$name, you got $score out of $totalQuestions correct ($percentage%). Thanks for playing!")
}

