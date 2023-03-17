FROM eclipse-temurin:17

MAINTAINER store.in

COPY target/onlineStore-0.0.1-SNAPSHOT.jar onlineStore-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","onlineStore-0.0.1-SNAPSHOT.jar"]
