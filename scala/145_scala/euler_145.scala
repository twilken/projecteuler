/*
 * Some positive integers n have the property that the 
 * sum [ n + reverse(n) ] consists entirely of odd (decimal) 
 * digits. For instance, 36 + 63 = 99 and 409 + 904 = 1313. 
 * We will call such numbers reversible; so 36, 63, 409, 
 * and 904 are reversible. Leading zeroes are not allowed in 
 * either n or reverse(n).
 * 
 * There are 120 reversible numbers below one-thousand.
 * 
 * How many reversible numbers are there below one-billion (10^9)?
 */

object Euler145 {

  def main(args:Array[String]) = {
    val startTime        = System.currentTimeMillis
    val numOfReversibles = (1 until 1000000000).par.count(isReversible(_))
    val executionTime    = System.currentTimeMillis - startTime
    println(numOfReversibles)
    println("Execution time is " + (executionTime + "ms."))
  }

  def isReversible(n:Int) : Boolean = {
    if (n % 10 == 0) false // last digit is now allowed to be zero 
    else {
      val sum = n + reverse(n)
      hasOddDigitsOnly(sum)
    }
  }

  def reverse(n:Int) : Int = {
    var num = n
    var res = 0

    while (num > 0) {
      res = res*10 + num%10
      num = num/10
    }
    
    res
  }

  def hasOddDigitsOnly(n:Int) : Boolean = {
    var rem   = n // remaining part 
    var isOdd = true

    while (rem > 0 && isOdd) {
      if (!isDigitOdd(rem % 10)) isOdd = false
      else rem /= 10
    }

    isOdd
  }

  def isDigitOdd(digit:Int) : Boolean = {
    digit match {
      case 0 | 2 | 4 | 6 | 8 => false
      case _                 => true
    }
  }
}
