FROM openjdk:11-oracle
COPY build/libs/*.jar testapp.jar
ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","testapp.jar"]