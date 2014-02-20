/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can 
 * see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */

def isPrime(candidate:Int) : Boolean = {
  if (candidate % 2 == 0) return false

  var divisor                   = 3
  var squareRootOfCandidate:Int = math.sqrt(candidate.toDouble).toInt + 1

  while( (candidate % divisor != 0) && (divisor < squareRootOfCandidate) ) {
	divisor += 2
  }
  divisor >= squareRootOfCandidate
}



val startTime       = System.currentTimeMillis
val nthPrime        = 10001 
var noOfPrimesFound = 1     // first tested value is 3, so 2 is already found
var candidate       = 1

while(noOfPrimesFound < nthPrime) {
  candidate += 2
  if (isPrime(candidate)) noOfPrimesFound += 1
}



val executionTime = System.currentTimeMillis - startTime

println("The " + nthPrime + " is " + candidate + ".")
println("Execution time is " + (executionTime + "ms."))

