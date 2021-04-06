//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/scala

object Solution {

  def duplicateEncode(word: String) = {
    // Your code here
    var result=""
    val lowerWord = word.toLowerCase()
    for (w <- lowerWord) {
      if (lowerWord.count(_ == w)>1) {
        result= result.concat(")")
      }
      else {
        result=result.concat("(")
      }   
    }
  result
  }
}