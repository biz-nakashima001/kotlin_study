fun sum(a: Int, b: Int) :Int{
    return a + b
} 
// fun printSum(a: Int, b: Int): Unit {
//     println("sum of $a and $b is ${a + b}")
// }

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    println("sum of 19 and 23 is ${sum(19, 23)}")
    printSum(-1, 8)
}
