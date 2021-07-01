package test.scala.collection

import scala.collection.mutable.ArrayBuffer
/**
 * @Classname TestArray
 * @Description TODO
 * @Date 2021/7/1 17:29
 * @Created by ${luohuan}
 */
object TestArray {
  def main(args: Array[String]): Unit = {
    /**
     * 不可变长数组
     */
    println("不可变长数组")
    val str = Array("hello","scala") //声明一个数组对象
    val first=str(0)//读取第一个元素
    str(1)="spark" //修改第二个元素
    val strAppend=str.map(_ + "yes")//所有元素加上字符“yes”
    str.foreach(x => print(x+ " "))//遍历打印数组每个元素
    print("\n")
    println("可边长数组")
    /**
     * 可边长数组
     */
    val ints=ArrayBuffer(1,2,3,4)
    ints(0)=10
    ints.append(5)//增加元素
    ints.append(6)
    ints.foreach(x => print(x+" "))
  }
}
