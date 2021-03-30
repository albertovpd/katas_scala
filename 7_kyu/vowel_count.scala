// https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/scala

object Sol {

  def getCount(inputStr: String): Int = {
    // your code here
    val vowels = Set('a', 'e', 'i', 'o', 'u')
    inputStr.filter(vowels.contains).length
  }
}