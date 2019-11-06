# Simple-java-api-client for Pure API
This project contains the output of the onboarding tutorial for the Pure API. The tutorial can be found on your Pure server at {host}/ws/api/onboarding.html.

## Prerequisites
To build and run this code the following tooling need to be installed on your machine 
* [Java SE Development Kit 8 (Oracle)](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or [OpenJDK 8 (open source)](https://adoptopenjdk.net/)
* [Maven](https://maven.apache.org/)

## Checkout project
``` 
    git clone git@github.com:ElsevierPure/sample-java-api-client.git
```
## Building project
Enter the sample-java-api-client folder and run
```     
    mvn clean install -DskipTests
```
## Run Test
To execute the test replace the values \<your Pure API key> and \<your Pure host> in the following command.
```
    mvn test -pl :custom-code -Dtest=TestExternalOrganizationApi -Dpure-api-key=<your Pure API key> -Dpure-api-base-path=<your Pure host>/ws/api
```