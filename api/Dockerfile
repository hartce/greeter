FROM amazonlinux:latest

RUN yum install java-1.8.0 -y
VOLUME /tmp
ARG JAR_FILE
ADD entrypoint.sh /usr/local/bin/entrypoint.sh
RUN chmod +x /usr/local/bin/entrypoint.sh
ADD /build/libs/greeting-api-0.1.0.jar /home/app.jar

ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]