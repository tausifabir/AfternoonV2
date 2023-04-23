FROM openjdk:11-oracle
COPY build/libs/*.jar testapp.jar
ENV PORT=8082
EXPOSE 8082
ENTRYPOINT ["java","-jar","testapp.jar"]