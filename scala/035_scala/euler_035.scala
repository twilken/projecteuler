/*
 * The number, 197, is called a circular prime because all rotations of the 
 * digits: 197, 971, and 719, are themselves prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 
 * 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below one million?
 */

def isCircularPrime(n:Int) : Boolean = {
  val len = numOfDigits(n)
  var i   = 0
  var r   = n 
  var res = true

  while (res && i < len) {
    if (!isPrime(r)) res = false 
    r = rotateRight(r)
    i += 1
  }

  (i == len) && res
}

def rotateRight(n:Int) : Int = {
  ((n / 10) + (n % 10 * math.pow(10, numOfDigits(n)-1))).toInt 
}

def isPrime(n:Int) : Boolean = {
  if (n <= 1)     return false
  if (n == 2)     return true
  if (n % 2 == 0) return false
  var divisor  = 3
  var sqrt:Int = math.sqrt(n.toDouble).toInt + 1
  while( (n % divisor != 0) && (divisor < sqrt) ) divisor += 2
  divisor >= sqrt
}

def numOfDigits(n:Int) : Int = {
  if      (n <         10)  1
  else if (n <        100)  2
  else if (n <       1000)  3  
  else if (n <      10000)  4
  else if (n <     100000)  5
  else if (n <    1000000)  6
  else if (n <   10000000)  7
  else if (n <  100000000)  8
  else if (n < 1000000000)  9
  else                     10
}

val max     = 1000000 
val matches = (1 until max).filter(isCircularPrime(_))
println(matches.length)
