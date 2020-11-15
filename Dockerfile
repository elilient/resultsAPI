FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=target/*.jar

EXPOSE 8888

COPY ${JAR_FILE} springboot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","springboot-0.0.1-SNAPSHOT.jar"]