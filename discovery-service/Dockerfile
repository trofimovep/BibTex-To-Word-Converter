FROM openjdk:11-jre-slim-buster
EXPOSE 8761
COPY ./build/libs/discovery-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar", "-Dserver.port=8761", "app.jar"]