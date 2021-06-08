FROM openjdk:8
ADD target/onlinemg.jar onlinemg.jar
ENV JPDA_ADDRESS=5005
ENV JPDA_TRANSPORT=dt_socket
EXPOSE 8080 5005
ENTRYPOINT [ "java", \
             "-Xms128m", "-Xmx256m", \
             "-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n", \
             "-jar","onlinemg.jar"]