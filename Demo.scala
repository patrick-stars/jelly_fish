package com.sai.demo

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

import scala.swing.ScrollPane

object Demo {


  def main(args: Array[String]): Unit = {
    //    val conf = new SparkConf().setAppName("test").setMaster("local[2]")
    ////    conf.set("spark.testing.memory", "2147480000")
    //    val sc = new SparkContext(conf)

    val sparkSession = SparkSession.builder().master("local").appName("tt").getOrCreate()

    val sc = sparkSession.sparkContext
    sc.setLogLevel("WARN")
    val textfile = sc.textFile("file:///F:/GitHub/spark-demo/readme.txt")

    println(textfile.count())
    textfile.foreach(println(_))


  }
}

