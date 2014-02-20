/*
 * A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91 * 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

val palindromes = 
  for { 
    a <- 1 to 999 
    b <- 1 to 999 
    product = a*b
    if (product.toString == product.toString.reverse) 
  } yield product

println(palindromes.max)
