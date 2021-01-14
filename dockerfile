FROM ubuntu:latest

WORKDIR /tmp/docker

ENV TZ=Asia/Kolkata

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN apt-get -y update && apt-get -y upgrade && apt-get -y install git

RUN apt-get -y install openjdk-8-jdk

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

RUN apt-get -y update && apt-get -y install maven

RUN  mvn --version

RUN git clone https://github.com/codinghumanity2347/Docker-shopping-cart.git

RUN cd Docker-shopping-cart &&  mvn clean install -Dmaven.test.skip=true

RUN mkdir /usr/local/tomcat

RUN  apt-get update && apt-get install -y curl

CMD /bin/bash

RUN curl -O https://archive.apache.org/dist/tomcat/tomcat-8/v8.5.56/bin/apache-tomcat-8.5.56.zip 

RUN cd /tmp && ls

RUN apt-get install unzip -y

RUN unzip  apache-tomcat-8.5.56.zip

RUN ls

RUN mv apache-tomcat-8.5.56 /tmp/apache-tomcat-8.5.56

RUN cp -rf  /tmp/apache-tomcat-8.5.56/  /usr/local/tomcat

EXPOSE 8080

RUN ls /tmp/docker/Docker-shopping-cart/target

RUN cp /tmp/docker/Docker-shopping-cart/target/ShoppingKart-0.0.1-SNAPSHOT.war  /usr/local/tomcat/apache-tomcat-8.5.56/webapps/

RUN chmod -R 777 /usr/local/tomcat/apache-tomcat-8.5.56

CMD  /usr/local/tomcat/apache-tomcat-8.5.56/bin/catalina.sh run
