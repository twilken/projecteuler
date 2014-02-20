/*
 * 2520 is the smallest number that can be divided by each of the 
 * numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible 
 * by all of the numbers from 1 to 20?
 */

val MAX = 20
var res = MAX

while ( !(1 to MAX).forall(res % _ == 0) ) res += MAX
println(res)