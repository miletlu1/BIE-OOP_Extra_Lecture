package extraLec

object Filters extends App{
  def removeEvenElements(list: List[Int]): List[Int] ={
	if(list.head % 2 == 0) removeEvenElements(list.tail)
	list.head::removeEvenElements(list.tail)
  }
  def removeOddElements(list: List[Int]): List[Int] ={
	if(list.head % 2 != 0) removeOddElements(list.tail)
	list.head::removeOddElements(list.tail)
  }
  def removeNegativeElements(list: List[Int]): List[Int] ={
	if(list.head < 0) removeNegativeElements(list.tail)
	list.head::removeNegativeElements(list.tail)
  }
  def removeZeroElements(list: List[Int]): List[Int] ={
	if(list.head == 0) removeZeroElements(list.tail)
	list.head::removeZeroElements(list.tail)
  }
}