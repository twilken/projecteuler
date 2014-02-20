/*
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 * 
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */ 

import BigInt._

val sum = (1 to 1000).map(b => b.pow(b)).sum.toString
val res = sum.substring(sum.length-10, sum.length)
println(res)
