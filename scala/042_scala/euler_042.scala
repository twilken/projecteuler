/*
 * The nth term of the sequence of triangle numbers is given by, tn = (1/2)n(n+1); 
 * so the first ten triangle numbers are:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * By converting each letter in a word to a number corresponding to its 
 * alphabetical position and adding these values we form a word value. For 
 * example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word 
 * value is a triangle number then we shall call the word a triangle word.
 *
 * Using words.txt (right click and 'Save Link/Target As...'), a 16K text file 
 * containing nearly two-thousand common English words, how many are triangle 
 * words?
 */

object TriangleWords {

  val triangles = (1 to 100).map(triangle(_))

  def main(args:Array[String]) = {
    val source = io.Source.fromFile("words.txt")
    val data = source.mkString
    source.close()
    val words = data.substring(1, data.length-1).split("\",\"") // get list of words
    val count = words.count(isTriangleWord(_))
    println(count)
  }

  def triangle(n:Long) : Long = n*(n+1)/2

  def isTriangleWord(word:String) : Boolean = {
    val value = word.foldLeft(0)((b, a) => b + a - 64)
    triangles contains value
  }
}
