FROM openjdk:17
EXPOSE 8988
COPY pom.xml .
ADD target/docker-spring-image.jar docker-spring-image.jar
ENTRYPOINT ["java","-jar","/docker-spring-image.jar"]



