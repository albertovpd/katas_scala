// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/scala

object RemoveFirstAndLastCharacters {
  def removeChars(s: String): String = {
    // removing 1st element of a string without the last one
    s.substring(1, s.length()-1)
  }
}