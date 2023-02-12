FROM openjdk:17

RUN mkdir /app

COPY /home/runner/work/roti-kacang/roti-kacang/user-service/build/libs/user-service.jar /app/app.jar

WORKDIR /app

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
