FROM openjdk:11-jre-slim-buster
EXPOSE 8085
ADD /build/libs/gateway-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar", "-Dserver.port=8085", "app.jar"]

#docker run -p 8080:8080 -p 8167:8167 --name b2w-gateway -e discovery-service-host=host.docker.internal --rm b2w-gateway
