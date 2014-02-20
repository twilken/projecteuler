/* 
 * If the numbers 1 to 5 are written out in words: one, two, three, four, 
 * five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written 
 * out in words, how many letters would be used?
 * 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) 
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
 * The use of "and" when writing out numbers is in compliance with British usage.
 */

import scala.collection.immutable.Map

val max   = 1000 
val lenOf = Map(0->0, 1->3, 2->3, 3->5, 4->4, 5->4, 6->3, 7->5, 8->5, 9->4, 10->3, 
  11->6, 12->6, 13->8, 14->8, 15->7, 16->7, 17->9, 18->8, 19->8, 20->6, 30->6, 40->5, 
  50->5, 60->5, 70->7, 80->6, 90->6, 100->7, 1000->11)
val and   = 3
var sum   = 0
var digit1 = 0

def len(n:Int) : Int = {
  var sum = 0

  if (n < 20) {
    sum += lenOf(n)
  }
  else if (n < 100) {
    digit1 = n%10
    sum += lenOf(digit1)
    sum += lenOf(n-digit1)
  }
  else if (n < max) {
    sum += lenOf(100)
    sum += lenOf(n / 100)
    digit1 = n%10
    if (n % 100 > 0) {
      sum += and
      if (n % 100 < 20) {
        sum += lenOf(n%100)
      }
      else {
        sum += lenOf(digit1)
        sum += lenOf((n%100)-digit1)
      }
    }
  }
  else sum += lenOf(max)
  sum
}

for (n <- (1 to max)) {
  sum += len(n) 
}

println(sum)
