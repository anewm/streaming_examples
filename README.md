streaming_examples
==================

Assumes: Spark (1.0.2) and Hadoop are installed


(A) Spark Streaming (using Scala)

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
  * We need to get the twitter oauth information now;
  * Go to https://dev.twitter.com/apps , and create an arbitrary application (put in arbitrary information)
  * At the bottom of the app page, click "Create my access token"
  * Go to the Oauth tool tab
  * Put the information in the twitter4j file you just created


* Add another .jar to your project build path: go to your Spark installation directory, go to the /lib folder and add "spark-assembly-1.0.2-hadoop2.2.0" (assuming you installed Spark version 1.0.2--if not, things may have changed and the other .jar files may not work together).
* Bring Tutorial.Scala into the project.
* Edit two lines: 
  * val ssc = new StreamingContext("local[12]", "Twitter Downloader", Seconds(30)) -->
  - (local[12] should be replaced with the URL of your Spark cluster (it could still be local[x] if it's installed locally))
  * val checkpointDir = "hdfs://localhost:9000/user/a/twittertest" put your hdfs location in there (and where you want to save the checkpoints)


Currently, saveAsTextFiles will save the tweets as text files, but there is much to play around with!--in terms of both where/how to save, and formatting etc

Sources:

http://ampcamp.berkeley.edu/big-data-mini-course/realtime-processing-with-spark-streaming.html and  http://www.pwendell.com/2013/09/28/declarative-streams.html

(B) Storm

(C) Kinesis
