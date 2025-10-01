FROM gradle:8.8-jdk21

WORKDIR /opt/app

COPY build/libs/tweetle-api-gateway-0.0.1-SNAPSHOT.jar ./

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar tweetle-api-gateway-0.0.1-SNAPSHOT.jar"]