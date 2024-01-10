FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG ./target/bikestoresapi.jar
COPY ./target/bikestoresapi.jar bikestoresapi.jar
ENTRYPOINT ["java","-jar","bikestoresapi.jar"]