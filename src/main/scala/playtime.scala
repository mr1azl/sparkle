import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.SparkContext._

object Playtime {
  def main(args: Array[String]) {
    val sparkConf = new SparkConf().setMaster("local").setAppName("sparkle").set("spark.executor.memory", "1g")
    val sc = new SparkContext(sparkConf)


    sc.stop() // will error without this
  }
}
