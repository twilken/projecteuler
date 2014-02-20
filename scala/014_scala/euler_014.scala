/* 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n -> n/2 (n is even)
 * n -> 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 * 13  40  20  10  5  16  8  4  2  1
 * It can be seen that this sequence (starting at 13 and finishing at 1) 
 * contains 10 terms. Although it has not been proved yet (Collatz Problem), 
 * it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */ 

def isEven(n:Long) : Boolean = { n % 2 == 0 }

def getSequenceLength(n:Int) : Int = {
  var i:Long = n   
  var len = 2 // n and 1 are already counted in  
  while (i > 1) {
    len += 1
    if (isEven(i)) i = i/2
    else i = i*3 + 1
  }
  len 
}

var maxLen = 0
var len    = 0 
var res    = 0

for (i <- 1 until 1000000) {
  len = getSequenceLength(i)
  if (len > maxLen) { 
    maxLen = len
    res = i
  }
}

println(res)
