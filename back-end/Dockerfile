# This Dockerfile uses Docker Multi-Stage Builds
# See https://docs.docker.com/engine/userguide/eng-image/multistage-build/
# Requires Docker v17.05

# Use OpenJDK JDK image for intermiediate build
FROM openjdk:17-jdk-oraclelinux8 AS build

# Install packages required for build
RUN apt-get -y update 
RUN apt-get install -y build-essential
RUN apt-get install -y git
RUN mkdir -p /usr/share/man/man1
RUN apt-get install -y maven

# Build from source and create artifact
WORKDIR /src

COPY mvn* pom.xml /src/
COPY src /src/src
COPY .git /src/.git
COPY .mvn /src/.mvn

RUN mvn clean test