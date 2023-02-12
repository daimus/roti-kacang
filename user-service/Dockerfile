FROM openjdk:17

RUN mkdir /app

COPY ~/package/user-service.jar /app/app.jar

WORKDIR /app

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
