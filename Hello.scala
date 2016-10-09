

import java.io.FileReader

import scala.io.Source
import java.io.{FileReader, FileNotFoundException, IOException}

object Hello {
  def main(args: Array[String]): Unit = {

    var dna = ""

    val filename = "/net/files.cis.ksu.edu/exports/home/m/mcdevitt/Bigdata/ScalaTest/src/main/scala/dna.txt"
    try {
     for (line <- Source.fromFile(filename).getLines()) {
       dna =(line.toString)
       println(line)
       println("test: " + dna)
     }
  } catch {
          case ex: FileNotFoundException => println("Couldn't find that file.")
          case ex: IOException => println("Had an IOException trying to read that file")
    }


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
    print( test(nums).map(x => makeAVector(x)))
    //println("Test is: " + test(nums))
    // println("Vec: " + makeAVector(1))
    println("dna: " + dna)

    def kmer(d:String,k:Int): List[String] = {
      var kmerList: List[String] = List()

        kmerList = d.subSequence(0,d.length + k-1)
      }

     kmer(dns,5).map(s => 1).sorted(_ < _)
    }

    println(find_kmers(dna,5,dna.length+1))


}
