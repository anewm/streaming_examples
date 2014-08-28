streaming_examples
==================

Assumes: Spark and Hadoop are installed


(A) Spark Streaming (using Scala)

Borrowing pieces of: http://ampcamp.berkeley.edu/big-data-mini-course/realtime-processing-with-spark-streaming.html and http://www.pwendell.com/2013/09/28/declarative-streams.html

(If you're using Eclipse for Scala, make sure you're using 4.2 or below (at least if you plan on using the Scala IDE plugin--it's possible this has been updated--just check))


* Create a new Scala project.
* Save .jar files in jars folder and add to project build path.
* Add the file "twitter4j.properties" to the root for your project directory:

```
  debug=true
  oauth.consumerKey=xxxx
  oauth.consumerSecret=xxxx
  oauth.accessToken=xxxx
  oauth.accessTokenSecret=xxxx
```
* (Follow the instructions http://ampcamp.berkeley.edu/big-data-mini-course/realtime-processing-with-spark-streaming.html from 1.2 to 1.3, and put the information in the twitter4j file you just created.)


* Add another .jar to your project build path: go to your Spark installation directory, go to the /lib folder and add "spark-assembly-1.0.2-hadoop2.2.0" (assuming you installed Spark version 1.0.2--if not, things may have changed and the other .jar files may not work together).
* Bring Tutorial.Scala into the project.
* Edit two lines: 
  * val ssc = new StreamingContext("local[12]", "Twitter Downloader", Seconds(30)) -->
  -- local[12] should be replaced with the URL of your Spark cluster (it could still be local[x] if it's installed locally)
  * val checkpointDir = "hdfs://localhost:9000/user/a/twittertest" put your hdfs location in there
