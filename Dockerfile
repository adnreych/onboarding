FROM openjdk:8
RUN apt-get update && apt-get install -y maven
COPY . ./onboarding
RUN mvn -f /onboarding/pom.xml -Dmaven.test.skip=true clean install
EXPOSE 8085