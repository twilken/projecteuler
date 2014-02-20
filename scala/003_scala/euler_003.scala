/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */

import BigInt._

var factor    = 2
var remainder = BigInt("600851475143")

while (remainder > 1) {
  if (remainder % factor != 0)
    factor += 1
  else
    remainder /= factor
}

println(factor)