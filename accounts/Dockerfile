#Start with a base image containers Java runtime
FROM openjdk

#Information around who maintains the images
MAINTAINER eazybytes.com

#Add the appllication's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Executes the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]