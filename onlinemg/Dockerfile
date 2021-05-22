FROM openjdk:8
ADD target/docker-onlinemg.jar docker-onlinemg.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-onlinemg.jar"]