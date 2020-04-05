FROM openjdk:14

WORKDIR /app
COPY build/libs/kotlin-spring-boot-docker-1.0.jar .

EXPOSE 8080 8080

ENTRYPOINT ["java", "-jar", "kotlin-spring-boot-docker-1.0.jar"]

LABEL app="kotlin-spring-boot-docker"
