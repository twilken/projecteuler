/*
 * In England the currency is made up of pound, L, and pence, p, and there are 
 * eight coins in general circulation:
 * 1p, 2p, 5p, 10p, 20p, 50p, L1 (100p) and L2 (200p).
 *
 * It is possible to make L2 in the following way:
 * 1*L1 + 1*50p + 2*20p + 1*5p + 1*2p + 3*1p
 * 
 * How many different ways can L2 be made using any number of coins?
 *
 * Note: The pound sign has been replaced by L.
 */

val startTime = System.currentTimeMillis
val coins     = List(1, 2, 5, 10, 20, 50, 100, 200)
 
def combos(coins:List[Int], amount:Int) : Int = {
  if (coins.isEmpty) 0
  else if (amount - coins.head < 0) 0
  else if (amount - coins.head == 0) 1
  else combos(coins, amount - coins.head) + combos(coins.tail, amount)
}
 
val res           = combos(coins, 200)
val executionTime = System.currentTimeMillis - startTime
println(res)
println("Execution time is " + (executionTime + "ms."))
