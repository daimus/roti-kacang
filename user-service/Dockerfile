FROM openjdk:17

RUN mkdir /app

COPY /home/runner/package/user-service.jar /app/app.jar

WORKDIR /app

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
