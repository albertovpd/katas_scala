// https://www.codewars.com/kata/55f2b110f61eb01779000053/train/scala

object Sum {
  def getSum(a: Int, b: Int): Int = {
    //Good luck!
    if (a<b) {(a to b).sum}
    else  { (b to a).sum}
  }
}


