/*
 * n! means n * (n * 1) * ... * 3 * 2 * 1
 * 
 * For example, 10! = 10 * 9 * ... * 3 * 2 * 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 */ 

def faculty(n:BigInt) : BigInt = { if (n==0) 1 else n * faculty(n-1) }

val f = faculty(100).toString.map(_.asDigit).sum
println(f)
