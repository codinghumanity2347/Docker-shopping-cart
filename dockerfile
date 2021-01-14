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

RUN cd Docker-shopping-cart  && mvn clean install

RUN mkdir /usr/local/tomcat

ADD http://www-eu.apache.org/dist/tomcat/tomcat-8/v8.5.53/bin/apache-tomcat-8.5.53.tar.gz /tmp/tomcat.tar.gz

RUN cd /tmp && tar xvfz tomcat.tar.gz

RUN cp -Rv /tmp/apache-tomcat-8.5.53/* /usr/local/tomcat/

EXPOSE 8080

RUN cp /tmp/docker/Docker-shopping-cart/target/ShoppingKart-0.0.1-SNAPSHOT.jar  /usr/local/tomcat/webapps/ShoppingKart-0.0.1-SNAPSHOT.jar

CMD /usr/local/tomcat/bin/catalina.sh run

