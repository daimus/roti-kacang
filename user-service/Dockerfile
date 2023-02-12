FROM openjdk:17

WORKDIR /app

COPY /home/runner/package /app

RUN echo $(ls -1 /app)

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "user-service.jar"]
