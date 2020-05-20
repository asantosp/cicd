FROM amazoncorretto:8
ARG JAR_FILE=target/cicd-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ROOT.jar
ENTRYPOINT ["java","-jar","/ROOT.jar"]

