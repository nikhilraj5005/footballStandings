FROM openjdk:8
EXPOSE 8080
ADD target/football-standings.jar football-standings.jar
ENTRYPOINT ["java","-jar","football-standings.jar"]