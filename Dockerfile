# let's create a Dockerfile for java21 and spring-boot application
FROM maven:3.9.6-eclipse-temurin-21-alpine AS builder

COPY . /src

WORKDIR /src

RUN mvn clean install -DskipTests

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=builder /src/target/*.jar /app/app.jar

ENV SERVER_PORT=8080

EXPOSE $SERVER_PORT

ENTRYPOINT [ "java", "-jar", "/app/app.jar" ]