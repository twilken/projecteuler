/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */

import BigInt._



def isPrime(candidate:Int) : Boolean = {
  if (candidate % 2 == 0) return false

  var divisor                   = 3
  var squareRootOfCandidate:Int = math.sqrt(candidate.toDouble).toInt + 1

  while( (candidate % divisor != 0) && (divisor < squareRootOfCandidate) ) {
	divisor += 2
  }
  divisor >= squareRootOfCandidate
}



val startTime        = System.currentTimeMillis
val threshold        = 2000000
var candidate        = 3
var sum              = BigInt(2)

while(candidate < threshold) {
  if (isPrime(candidate)) sum += candidate
  candidate += 2
}

val executionTime = System.currentTimeMillis - startTime

println("The sum of all primes below " + threshold + " is " + sum + ".")
println("Execution time is " + (executionTime + "ms."))