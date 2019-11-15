package extraLec

object FlatMap extends App{
  def copyEach(list: List[Int]): List[Int] = {
	list match{
	  case ::(head, next) =>
		for(i <- 1 to head)
		  head::copyEach(next)
	  case Nil => Nil
	}
  }

  println(copyEach(List(1, 2, 3, 4)))
}