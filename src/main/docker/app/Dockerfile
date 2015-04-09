FROM dockerfile/java:oracle-java7

EXPOSE 8080
EXPOSE 9200
EXPOSE 9300

WORKDIR /

ADD ${project.build.finalName}.jar .

CMD java -jar /${project.build.finalName}.jar