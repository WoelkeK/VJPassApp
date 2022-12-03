FROM eclipse-temurin:17-jdk-alpine
ADD target/VJPassApp-0.0.1-SNAPSHOT.jar .
EXPOSE 8808
CMD java -jar VJPassApp-0.0.1-SNAPSHOT.jar