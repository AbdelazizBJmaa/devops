FROM openjdk:17
COPY demo/target/demo-0.0.1-SNAPSHOT.jar demo/app.jar
CMD java -jar /demo/app.jar

