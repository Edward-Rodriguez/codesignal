import scala.collection.mutable

object Main extends App {
  def firstDuplicate(a: Array[Int]): Int = {
    var set = Set[Int]()
    for (num <- a) {
      if (set.contains(num)) return num
      else set += num
    }
    -1
  }
}
