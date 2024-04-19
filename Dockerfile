FROM openjdk:21

ADD . /source

RUN cd /source && ./mvnw clean package
RUN cp /source/target/*.jar /app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]
