FROM java:8
VOLUME /tmp
ADD core-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9000 9001 5005
CMD java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,suspend=n,address=5005 -jar app.jar
