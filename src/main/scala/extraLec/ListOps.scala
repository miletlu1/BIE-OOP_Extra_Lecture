package extraLec
import scala.annotation.tailrec
object ListOps extends App{
  @tailrec
  def count(list: List[Int]): Int = {
	var acc: Int = 0
	list match{
	  case _ :: tail =>
		acc += 1
		count(tail)
	  case Nil => acc
	}
  }
  @tailrec
  def sum(list: List[Int]): Int = {
	var acc: Int = 0
	list match{
	  case h :: tail =>
		  acc += h
		  sum(tail)
	  case Nil => acc
  	}
  }
  @tailrec
  def min(list: List[Int]): Int = {
	var mini: Int = Int.MaxValue
	list match{
	  case ::(head, next) =>
		if (head < mini) mini = head
		min(next)
	  case Nil => mini
	}
  }

  @tailrec
  def max(list: List[Int]): Int = {
	var maxi: Int = Int.MinValue
	list match{
	  case ::(head, next) =>
		if (head < maxi) maxi = head
		max(next)
	  case Nil => maxi
	}
  }

  def mean(list: List[Int]): Int = {
	sum(list)/count(list)
  }

  def median(list: List[Int]): Int = {
	???
  }

  @tailrec
  def product(list: List[Int]): Int = {
	var acc: Int = 0
	list match{
	  case h :: tail =>
		acc *= h
		product(tail)
	  case Nil => acc
	}
  }

}