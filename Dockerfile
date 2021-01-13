FROM ubuntu:latest

WORKDIR /tmp/docker

RUN apt-get -y update && apt-get -y upgrade && apt-get -y install git

RUN apt-get -y install openjdk-8-jdk

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

RUN apt-get -y update && apt-get -y install maven

RUN git clone https://github.com/codinghumanity2347/Docker-shopping-cart.git

RUN cd Docker-Shopping Cart  && mvn clean install -Dmaven.test.skip=true

RUN mkdir /usr/local/tomcat

ADD http://www-eu.apache.org/dist/tomcat/tomcat-8/v8.5.53/bin/apache-tomcat-8.5.53.tar.gz /tmp/tomcat.tar.gz

RUN cd /tmp && tar xvfz tomcat.tar.gz

RUN cp -Rv /tmp/apache-tomcat-8.5.53/* /usr/local/tomcat/

EXPOSE 8080

RUN cp /tmp/docker/Employees-Sample/target/Spring201-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/Spring201-0.0.1-SNAPSHOT.war

CMD /usr/local/tomcat/bin/catalina.sh run

