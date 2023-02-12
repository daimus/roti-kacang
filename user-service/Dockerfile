FROM openjdk:17

WORKDIR /app

COPY /home/runner/package/user-service.jar /app/user-service.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "user-service.jar"]
