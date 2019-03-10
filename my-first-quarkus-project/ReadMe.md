# This is sample example using quarkus framework

### Before building the docker image run:
```
 mvn package -Pnative -Dnative-image.docker-build=true
```
### Then, build the image with:
```
 docker build -f src/main/docker/Dockerfile -t quarkus/my-first-quarkus-project .
```
### Then run the container using:
```
 docker run -i --rm -p 8080:8080 quarkus/my-first-quarkus-project
```
### after all above steps please use below url:
```
  http://127.0.0.1:8080/
```
