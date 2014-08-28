
import org.apache.hadoop.io.compress.DefaultCodec
import org.apache.spark.streaming._
import twitter4j._
import org.apache.spark.streaming.twitter.TwitterUtils
import org.apache.spark.api.java._
import org.apache.spark.streaming.api.java._
import org.apache.spark._

object Tutorial 
{
  def main(args: Array[String]) 
  {
    
    val ssc = new StreamingContext("local[12]", "Twitter Downloader", Seconds(30))
    
    val tweets = TwitterUtils.createStream(ssc, None)

    
    val statuses = tweets.map(status => status.getText())
//    statuses.print()
    statuses.saveAsTextFiles("prefixidk", "suffixidk")
    
    //hdfs location
    val checkpointDir = "hdfs://localhost:9000/user/a/twittertest"
    
    ssc.checkpoint(checkpointDir)
    
    ssc.start()
    ssc.awaitTermination()
    
 
	
  }
}