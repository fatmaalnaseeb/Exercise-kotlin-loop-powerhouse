import java.math.BigInteger

fun main() {
    //countUpwards(2,8)
    //countDownwards(8,2)
    //val numbers = intArrayOf(2,2,100)
    //println(calculateSum(numbers))
    //checkEvenOdd(5)
    //println(calculateFactorial2(5))
    //println(calculateFactorial2(90))
    //requestNumber()
    //multiplicationTable(3)
    //buildWord()


}

//2
fun countUpwards(start: Int, end: Int){
    for (num in start..end)
        println(num)
}
//2
fun countDownwards(end: Int, start: Int){
    var num = end
    while (num >= start ){
        println(num)
        num --}

}

//3
fun calculateSum(numbers: IntArray) : Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}
//4
fun checkEvenOdd(number: Int){

    for ( even in 1..number) {
        if (even % 2 == 0)
            println(even)

    }
    for (odd in 1..number){
        if (odd %2 != 0)
            println(odd)
    }


}
//5
fun calculateFactorial(number: Int) :Long{
    var factorial = 1L
    for (num in 1..number) {
        factorial *= num
    }
    return factorial

}


// The previous factorial function used Long, but it didn’t work for large numbers like 100.
//To fix this, I used BigInteger, which can store much larger numbers without any issues.

fun calculateFactorial2(number: Int) : BigInteger {
    var factorial = BigInteger.ONE
    for (num in 1..number){
        factorial = factorial.multiply(BigInteger.valueOf(num.toLong()))
    }
    return factorial

}
//Bonus
fun requestNumber(){
    var num : Int
    do {
        println("Enter a number '0 to exit': ")
        // readLine() return string or null
        num  = readLine()?.toIntOrNull() ?: -1
        if (num == -1) {
            println("please try again")

        }
        else{
            println(num)
        }


    }while (num != 0)
}

fun multiplicationTable(size: Int) {
    for (row in 1..size) {
        for (column in 1..size) {
            println(row*column)
        }

    }
}

fun buildWord(){
    var num : Int
    // Loop to get a valid number of letters
    while (true) {
        println("How many letters you will enter: ")
        num = readLine()?.toIntOrNull() ?: -1
        if (num > 0) break
        println("Wrong value! Please enter a valid number!")
    }

    var word = ""
    // Loop to collect letters
    for (i in 1..num) {
        print("Enter a letter: ")
        val newLetter = readLine()
        if (newLetter != null && newLetter.isNotEmpty()) {
            word += newLetter //Concatenate
        }
    }
    println("The word is: $word")

}


