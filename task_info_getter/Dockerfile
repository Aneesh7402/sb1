# Use the eclipse-temurin:17-jdk-alpine image as the base image
FROM eclipse-temurin:17-jdk-alpine

# Expose port 8080 (optional, for documentation purposes)
EXPOSE 8082

# Copy the Spring Boot application JAR file into the container
COPY build/libs/task_info_getter-0.0.1-SNAPSHOT.jar /app2.jar

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app2.jar"]