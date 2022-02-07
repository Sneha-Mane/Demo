FROM openjdk:8
ADD target/demo-0.0.1-SNAPSHOT.jar Dockerproject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Dockerproject-0.0.1-SNAPSHOT.jar"]