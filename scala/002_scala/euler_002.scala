/*
 * Each new term in the Fibonacci sequence is generated by adding the previous 
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not 
 * exceed four million, find the sum of the even-valued terms.
 */

val MAX = 4000000
var f1  = 1
var f2  = 2
var sum = 0
var tmp = 0

while(f2 < MAX) {

  // add to sum if fibonacci num is even
  if (f2 % 2 == 0) {
    sum += f2;
  }

  // compute next fibonacci
  tmp = f1 + f2
  f1  = f2
  f2  = tmp
}

println(sum)