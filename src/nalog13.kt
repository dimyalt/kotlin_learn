fun calcTax(sum:Int = 1000):Double {
    val taxRate = 0.13

    return taxRate*sum.toDouble()
}


fun main() {
    val sumUser:String? = readLine()

    if (sumUser == null) return

    val sum:Int = sumUser.toInt()

    val tax:Double = calcTax(sum)

    println("For ${sum} tax is ${tax}")
}