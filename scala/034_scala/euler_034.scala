/*
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 *
 * Find the sum of all numbers which are equal to the sum of the 
 * factorial of their digits.
 *
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */

def isCurious(n:Int) : Boolean = n == sumOfFactorialOfDigits(n)

def sumOfFactorialOfDigits(n:Int) : Int = n.toString.map(x => fac(x.asDigit)).sum

def fac(n:Int) : Int = {
  n match {
    case 0 =>      1
    case 1 =>      1
    case 2 =>      2
    case 3 =>      6
    case 4 =>     24
    case 5 =>    120 
    case 6 =>    720
    case 7 =>   5040
    case 8 =>  40320
    case 9 => 362880
  }
}

val max = 9999999 // 7*(9!) < 9999999
val res = (3 to max).filter(isCurious(_)).sum
println(res)
