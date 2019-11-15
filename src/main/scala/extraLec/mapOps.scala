package extraLec

import scala.annotation.tailrec

object mapOps extends App{
  def squareEach(list: List[Int]): List[Int] = {
	@tailrec
	def inner (ls: List[Int], acc: List[Int]): List[Int] ={
	  if (ls == Nil)
		return acc
	  inner(ls.tail, ls.head * ls.head::acc)
	}
	inner(list, Nil)
  }
  def negateEach(list: List[Int]): List[Int] = {
	@tailrec
	def inner (ls: List[Int], acc: List[Int]): List[Int] ={
	  if (ls == Nil)
		return acc
	  inner(ls.tail, (ls.head * -1)::acc)
	}
	inner(list, Nil)
  }
  def addToEach(list: List[Int], value: Int): List[Int] = {
	@tailrec
	def inner (ls: List[Int], acc: List[Int]): List[Int] ={
	  if (ls == Nil)
		return acc
	  inner(ls.tail, (ls.head + value)::acc)
	}
	inner(list, Nil)
  }
  def multiplyEach(list: List[Int], value: Int): List[Int] = {
	@tailrec
	def inner (ls: List[Int], acc: List[Int]): List[Int] ={
	  if (ls == Nil)
		return acc
	  inner(ls.tail, (ls.head * value)::acc)
	}
	inner(list, Nil)
  }
}