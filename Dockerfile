FROM eclipse-temurin:21.0.11_10-jre-noble
WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java" , "-jar" , "app.jar"]