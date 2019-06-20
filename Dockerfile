FROM openjdk:8-jdk-alpine

LABEL maintainer="Rainist Engineering <engineering@rainist.com>"

#-- For Embedded tomcat, required /tmp
VOLUME /tmp

ADD ./build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
