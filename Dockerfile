FROM openjdk:17
EXPOSE 8998
COPY target/spring-image.jar .
ENTRYPOINT ["java","-jar","/spring-image.jar"]


