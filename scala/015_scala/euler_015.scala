/*
 * Starting in the top left corner of a 2*2 grid, there are 6 
 * routes (without backtracking) to the bottom right corner.
 *
 * How many routes are there through a 20*20 grid?
 */

def fac(n:BigInt) : BigInt = { if (n==0) 1 else n * fac(n-1) }

val gridSize   = 20
val stepsRight = gridSize
val stepsLeft  = gridSize
val stepsTotal = stepsRight + stepsLeft
val routes     = fac(stepsTotal) / fac(stepsRight) / fac(stepsLeft)

println(routes)
