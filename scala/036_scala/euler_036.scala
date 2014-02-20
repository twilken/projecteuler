/*
 * The decimal number, 585 = 10010010012 (binary), is palindromic in 
 * both bases.
 *
 * Find the sum of all numbers, less than one million, which are 
 * palindromic in base 10 and base 2.
 *
 * (Please note that the palindromic number, in either base, may 
 * not include leading zeros.)
 */

def isBase10Palindrome(n:Int) : Boolean = {
  val s = n.toString
  s == s.reverse
}

def isBase2Palindrome(n:Int) : Boolean = {
  val s = n.toBinaryString
  s == s.reverse
}

val max     = 1000000
val matches = 
  for {
    n <- 1 until max
    if (isBase10Palindrome(n))
    if (isBase2Palindrome(n))
  } yield n

println(matches.sum)
