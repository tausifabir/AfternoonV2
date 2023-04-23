FROM openjdk:11-oracle
COPY build/libs/*.jar testapp.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","testapp.jar"]