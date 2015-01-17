FROM dockerfile/java:oracle-java7

EXPOSE 8080

ADD ${project.build.finalName}.jar .
ADD elasticsearch.yml .

CMD java -cp / -jar /${project.build.finalName}.jar