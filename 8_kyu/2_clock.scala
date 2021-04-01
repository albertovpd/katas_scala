// https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/scala

object Kata {
  def past(h: Int, m: Int, s: Int): Int = 1000 *( s + 60*(m + 60*h))
}