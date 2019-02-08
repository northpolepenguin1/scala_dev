val add = new Function2[Int, Int, Int] {
  def apply(x: Int, y: Int): Int = x + y
}

val new_add = (x: Int, y: Int) => x + y

val addCurried = (x: Int) => ((y: Int) => x + y)
