package extraLec

object Factorial extends App{
  def FacRec(num: Int): Int ={
	if (num == 0 || num == 1)
	   1
	else
	  num + FacRec(num - 1) + FacRec(num - 2)
  }
}