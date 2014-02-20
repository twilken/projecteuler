/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

def isTriplet(a:Int, b:Int, c:Int) : Boolean = square(a) + square(b) == square(c)
def square(base:Int) = base * base

val sum = 1000
val res =
  for {
    a <- (  1 to sum)
    b <- (a+1 to sum)
    c <- (b+1 to sum)
    if (isTriplet(a, b, c))
    if (a+b+c == sum)
  } yield a*b*c

println(res(0))
