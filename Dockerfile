FROM openjdk:17
EXPOSE 8080
COPY target/docker-spring-image.jar .
ENTRYPOINT ["java","-jar","/docker-spring-image.jar"]


