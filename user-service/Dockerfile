FROM openjdk:17

WORKDIR /app

COPY app.jar /app

RUN echo $(ls -1 /app)

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
