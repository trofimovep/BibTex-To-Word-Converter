FROM openjdk:17
EXPOSE 8761
ADD /build/libs/discovery-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar", "-Dserver.port=8761", "app.jar"]