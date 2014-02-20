/*
 * A perfect number is a number for which the sum of its proper divisors is 
 * exactly equal to the number. For example, the sum of the proper divisors 
 * of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect 
 * number.
 *
 * A number n is called deficient if the sum of its proper divisors is less 
 * than n and it is called abundant if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest 
 * number that can be written as the sum of two abundant numbers is 24. By 
 * mathematical analysis, it can be shown that all integers greater than 28123 
 * can be written as the sum of two abundant numbers. However, this upper limit 
 * cannot be reduced any further by analysis even though it is known that the 
 * greatest number that cannot be expressed as the sum of two abundant numbers 
 * is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum 
 * of two abundant numbers.
 */

import scala.collection.mutable.HashSet

def sumOfNumsWhichAreNotASumOfTwoAbundants(abundants:Array[Int]) : Int = {
  var a    = 0
  var b    = 0 
  var sum  = 0
  val sums = HashSet[Int]()
  var run  = true

  // collect sums of abundant numbers
  while (a < abundants.length) {
    while (b < abundants.length && run) {
      sum = abundants(a) + abundants(b) 
      if (sum <= max) sums += sum
      else run = false
      b += 1
    }
    run = true
    a += 1
    b = a
  }

  // sum of numbers which are not a sum of two abundant numbers
  (1 to max).filter(!sums(_)).sum
}

def abundantNums(max:Int) : Array[Int] = (1 to max).filter(isAbundant(_)).toArray
def isAbundant(n:Int) : Boolean = sumOfFactors(n) > n
def sumOfFactors(n:Int) : Int = (1 until ((n/2)+1)).filter(n % _ == 0).sum

val max       = 20161 //28123
val abundants = abundantNums(max)
val res       = sumOfNumsWhichAreNotASumOfTwoAbundants(abundants)

println(res)
