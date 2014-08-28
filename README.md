streaming_examples
==================

Assumes: Spark and Hadoop are installed


(A) Spark Streaming (using Scala)

Borrowing pieces of: http://ampcamp.berkeley.edu/big-data-mini-course/realtime-processing-with-spark-streaming.html and http://www.pwendell.com/2013/09/28/declarative-streams.html

(If you're using Eclipse for Scala, make sure you're using 4.2 or below (at least if you plan on using the Scala IDE plugin--it's possible this has been updated--just check))


1. Create a new Scala project.
2. Save .jar files in jars folder and add to project build path.
3. Bring Tutorial.Scala into the project.
4. Add the file "twitter4j.properties" to the root for your project directory:

-debug=true
 -dsfdsf
⋅⋅* oauth.consumerKey=xxxx
⋅⋅* oauth.consumerSecret=xxxx
⋅⋅* oauth.accessToken=xxxx
⋅⋅* oauth.accessTokenSecret=xxxx

⋅⋅⋅Follow the instructions http://ampcamp.berkeley.edu/big-data-mini-course/realtime-processing-with-spark-streaming.html from 1.2 to 1.5, and put the information in the twitter4j file you just created.

5. Add another .jar to your project build path: go to your Spark installation directory, go to the /lib folder and add "spark-assembly-1.0.2-hadoop2.2.0" (assuming you installed Spark version 1.0.2--if not, things may have changed and the other .jar files may not work together).
* 
