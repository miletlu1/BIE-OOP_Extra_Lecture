package extraLec
import scala.annotation.tailrec

object CompoundInterest extends App{
  @tailrec
  def compIntRec(Balance: Double, IR: Double, time: Int):Double = {
	if(time == 0)
	  return Balance
	val InterestValue = Balance * (IR/100)
	compIntRec(Balance + InterestValue, IR, time - 1)
  }
}
