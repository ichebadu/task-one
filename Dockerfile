FROM openjdk:17-jdk
WORKDIR /app
COPY target/*.jar /app/task-one.jar
EXPOSE 8080
CMD ["java","-jar","task-one.jar"]
