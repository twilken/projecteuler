/*
 * Starting with the number 1 and moving to the right in a 
 * clockwise direction a 5 by 5 spiral is formed as follows:
 * 
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral 
 * formed in the same way?
 */ 

// deliberations regarding the problem:
//
// the sum of the diagonal values of a column on the right 
// equals the sum on the left
//
// 1*1 3*3 5*5 7*7  9*9 11*11   // 0) composition of 1)
//   1,  9, 25, 49,  81,  121   // 1) mid to upper right
//   x,  3, 13, 31,  57,   91   // 2) mid to lower right
//   1, 12, 38, 80, 138,  212   // 3) sum 
//   0,  6, 12, 18,  24,   30   // 4) difference 1) - 2)

val size = 1001
val rightSide = (1 to (size,2)).map(x => 2*x*x - (x/2)*6 ).sum - 1
println(2*rightSide - 1)


