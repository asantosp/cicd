FROM amazoncorretto:8
# RUN yum install shadow-utils -y
# RUN groupadd -r spring && useradd -r spring -g spring
# USER spring:spring
ARG JAR_FILE=target/cicd-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ROOT.jar
# EXPOSE 9090
ENTRYPOINT ["java","-jar","/ROOT.jar"]