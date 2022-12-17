FROM openjdk:11-jre-slim-buster
EXPOSE 8088
COPY /build/libs/b2w-converter-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar", "-Dserver.port=8088", "app.jar"]

#docker run -p 8088:8088 -p 8167:8167 --name gradle-b2w-converter  -e discovery-service-host=host.docker.internal --rm gradle-b2w-converter
