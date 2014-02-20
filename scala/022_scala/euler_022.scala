/*
 * Using names.txt (right click and 'Save Link/Target As...'), a 
 * 46K text file containing over five-thousand first names, 
 * begin by sorting it into alphabetical order. Then working out the 
 * alphabetical value for each name, multiply this value by its 
 * alphabetical position in the list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, 
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the 
 * list. So, COLIN would obtain a score of 938 * 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 */ 

def score(name:String, pos:Int) : Int = pos * (name.map(_ - 64).sum)

val source = io.Source.fromFile("names.txt")
val dataString = source.mkString
source.close()
val unsorted = dataString.substring(1, dataString.length-1).split("\",\"")
val sorted = unsorted.toList.sortWith(_ < _)
var sum = 0
for (i <- 0 until sorted.length) { sum += score(sorted(i), i+1) }
println(sum)
