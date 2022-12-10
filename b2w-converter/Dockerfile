FROM openjdk:17
EXPOSE 8088
ADD /build/libs/b2w-converter-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar", "-Dserver.port=8080", "app.jar"]

#docker run -p 8088:8088 -p 8167:8167 --name b2w-converter -e discovery-service-host=host.docker.internal --rm b2w-converter
