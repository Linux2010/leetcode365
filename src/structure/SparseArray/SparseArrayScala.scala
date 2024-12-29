package structure.SparseArray

import java.io.PrintWriter
import scala.io.Source
import java.io._
import scala.collection.mutable.ArrayBuffer
object SparseArrayScala {

  def main(args: Array[String]): Unit = {
    val array = Array.ofDim[Int](9,9)
    array(5)(5) = 1
    array(5)(6) = 2
    array(6)(6) = 2
    array(7)(6) = 1
    array(3)(3) = 1
    array(3)(4) = 1

    // 打印数组
    for (row <- array) {
      println(row.mkString(" "))
    }
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>")
    val path = "./data/map.data"
    saveSparseArray(array, path)
    val res = readSparseArray(path)
    //打印还原的数组
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>")
    for (row <- res) {
      println(row.mkString(" "))
    }

  }

  def saveSparseArray(array : Array[Array[Int]], path : String) : Unit = {
    var count = 0
    for(row <- array){
      row.foreach(v=>if(v!=0) count = count + 1)
    }
    val sparse_array = Array.ofDim[Int](count+1,3)
    val x = array.length
    val y = array(0).length
    sparse_array(0)(0) = x
    sparse_array(0)(1) = y
    sparse_array(0)(2) = count
    var i = 1
    for(index_x <-  array.indices){
      for (index_y <-  array(index_x).indices){
        if(array(index_x)(index_y) != 0){
          sparse_array(i)(0) = index_x
          sparse_array(i)(1) = index_y
          sparse_array(i)(2) = array(index_x)(index_y)
          i = i + 1
        }
      }
    }
    //存储稀疏矩阵
    writeFileByLine("./data/map.data",sparse_array)
  }

  def readSparseArray(path : String) : Array[Array[Int]] = {
    val source = Source.fromFile(path)
    val lines = source.getLines().toVector
    var index = lines(0).split(",")
    val res = Array.ofDim[Int](index(0).toInt,index(1).toInt)
    for(i <- 1 until lines.length){
      index = lines(i).split(",")
      res(index(0).toInt)(index(1).toInt) = index(2).toInt
    }
    source.close()
    res
  }

  // 按行写入文件

  // 按行读取文件
  def writeFileByLine(filePath: String, array : Array[Array[Int]]): Unit = {
    val lines = ArrayBuffer[String]()
    array.foreach(row => lines += row.mkString(","))
    val writer = new PrintWriter(new File(filePath))
    lines.foreach(line => writer.println(line))
    writer.close()
  }

}
