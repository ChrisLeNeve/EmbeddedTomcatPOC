This is a sample on how to create an embedded Tomcat in your application. Good for example for unit tests.
Followed this tutorial: http://zetcode.com/web/embeddedtomcat/

1 - Run a "mvn clean install" to install dependencies.

2 - Open Netbeans, go Open Project, select this project, then run it (I could have written a batch that would do everything for you, but I'm not going to bother doing cURL or Maveny stuff for this project)

3 - Hit http://localhost:8083

Have a look at the Tomcat class documentation for more info: https://tomcat.apache.org/tomcat-7.0-doc/api/org/apache/catalina/startup/Tomcat.html
