FROM dockerfile/java:oracle-java7

EXPOSE 8080
EXPOSE 9200
EXPOSE 9300

ADD ${project.build.finalName}.jar .

CMD java  -jar /${project.build.finalName}.jar