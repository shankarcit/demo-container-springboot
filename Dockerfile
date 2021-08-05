FROM openjdk:8-jdk-alpine
MAINTAINER shankarcit@gmail.com
COPY build/libs/demo-container-springboot-0.0.1-SNAPSHOT.jar demo-container-springboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demo-container-springboot-0.0.1-SNAPSHOT.jar"]