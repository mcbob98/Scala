/**
  * Created by mcdevitt on 9/23/16.
  */
object Hello {
  def main(args: Array[String]): Unit = {

    def mod3(l:List[Int]) : List[Int] = {
      val rem:List[Int] = for(i <- l) yield i % 5

      return rem
    }

    def makeAVector(input:Int): Vector[Int] ={
      val v = scala.collection.immutable.Vector.empty
      val newVec = v ++ List(input, input + 7)
      return (newVec)
    }
    val nums: List[Int] = List(1,2,3,4,5,6,7,8,9,10)

    println(mod3(nums))
    var test = (x:List[Int]) => for(x <- nums) yield x % 5
    println("Test is: " + test(nums))
    println("Vec: " + makeAVector(1))
  }

}
