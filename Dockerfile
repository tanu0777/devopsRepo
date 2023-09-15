FROM openjdk:17
EXPOSE 8082
ADD target/FirstHelloApp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
