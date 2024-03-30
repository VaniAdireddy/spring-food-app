FROM openjdk:17

EXPOSE 8998

ADD target/docker-spring-image.jar docker-spring-image.jar

ENTRYPOINT ["java","-jar","/docker-spring-image.jar"]
