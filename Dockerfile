FROM openjdk:11
EXPOSE 8089
ADD /target/tpachatproject.jar tpachatproject.jar
ENTRYPOINT ["java", "-jar", "/tpachatproject.jar"]