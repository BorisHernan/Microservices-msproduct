FROM openjdk:17-alpine
WORKDIR /app
COPY ./target/Product-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","app.jar"]