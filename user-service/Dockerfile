FROM openjdk:8-jdk

RUN mkdir /app

COPY user-service/build/libs/user-service.jar /app/app.jar

WORKDIR /app

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]