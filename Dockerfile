FROM openjdk:11
COPY target/geomatys-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#FROM --platform=linux/amd64 image:tag
#linux/amd64, linux/arm64, or darwin/amd64
#docker build . --tag europe-west9-docker.pkg.dev/cloudrun-java/cloud-run-source-deploy/geomatys-backend:latest --platform=linux/amd64
#docker push europe-west9-docker.pkg.dev/cloudrun-java/cloud-run-source-deploy/geomatys-backend:latest