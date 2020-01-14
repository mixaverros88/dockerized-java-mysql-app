FROM java:8  
COPY /target/DockerConnectMySQL-1.0-SNAPSHOT.jar /
WORKDIR /
CMD ["java", "-classpath", "DockerConnectMySQL-1.0-SNAPSHOT.jar:.","DockerConnectMySQL"]