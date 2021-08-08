FROM tomcat:8.5.69-jdk8-adoptopenjdk-hotspot

COPY conf/tomcat/server.xml /usr/local/tomcat/conf/server.xml
COPY target/beer-0.0.1-SNAPSHOT.war $CATALINA_HOME/webapps/