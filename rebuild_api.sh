#!/bin/bash

# Clean the old api-folder
rm -rf pure-api
# Generate new API based on Pure running localhost
java -jar openapi-generator-cli-4.2.0.jar generate -i http://localhost:8080/ws/api/openapi.yaml --remove-operation-id-prefix --generator-name java --output pure-api --additional-properties=parentGroupId=com.elsevier.pure.api.sample,parentArtifactId=sample-pure-api-java-client,parentVersion=1.0-SNAPSHOT,groupId=com.elsevier.pure.api.sample,artifactId=pure-api,artifactVersion=1.0-SNAPSHOT,modelPackage=com.elsevier.pure.api.sample.stubs.model,apiPackage=com.elsevier.pure.api.sample.stubs.api,invokerPackage=com.elsevier.pure.api.sample.stubs.invoker

rm -rf pure-api-python
java -jar openapi-generator-cli-4.2.0.jar generate -i http://localhost:8080/ws/api/openapi.yaml --remove-operation-id-prefix --generator-name python-experimental --output pure-api-python

# Try and recompile the project
mvn clean install -DskipTests