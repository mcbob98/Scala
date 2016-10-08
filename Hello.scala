/**
  * Created by mcdevitt on 9/23/16.
  */
object Hello {
  def main(args: Array[String]): Unit = {

    def mod3(l:List[Int]) : List[Int] = {
      val rem:List[Int] = for(i <- l) yield i % 5

      return rem
    }
    val nums: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
    
  print(mod3(nums))
  }

}
