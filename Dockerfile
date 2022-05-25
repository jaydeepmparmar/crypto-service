FROM amazoncorretto:11-alpine
WORKDIR /app
COPY target/crypto-service-0.0.1-SNAPSHOT.jar /app/crypto-service.jar
ENTRYPOINT ["java", "-jar", "/app/crypto-service.jar"]
