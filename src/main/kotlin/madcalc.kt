import java.util.*
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter first number; ")
    val no1:Double = reader.nextDouble()
    print("Choose operator; ")

    val operator1 = readln()
    print("Enter a second number; ")
    val no2:Double = reader.nextDouble()
    if (operator1 == "+" ){
        val ans = no1 + no2

        println(" $no1 + $no2 = $ans")
    }else if (operator1 == "-" ) {
        val ans = no1 - no2

        println(" $no1 - $no2 = $ans")
    }else if (operator1 == "*" ) {
        val ans = no1 * no2

        println(" $no1 * $no2 = $ans")
    }else if (operator1 == "/" ) {
        val ans = no1 / no2


        println(" $no1 / $no2 = $ans")
    }
}