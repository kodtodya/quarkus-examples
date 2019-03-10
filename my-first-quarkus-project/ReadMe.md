# This is sample example using quarkus framework

### Before building the docker image run:
```
 mvn package -Pnative -Dnative-image.docker-build=true
```
### Then, build the image with:
```
 docker build -f src/main/docker/Dockerfile -t kodtodya/pallindrome-string-using-quarkus .
```
### Then run the container using:
```
 docker run -i --rm -p 8080:8080 kodtodya/pallindrome-string-using-quarkus
```
### after all above steps please use below url:
```
  http://127.0.0.1:8080/
```
### Once you are able to run, please use below command to push your docker image to docker hub:
```
 docker push kodtodya/pallindrome-string-using-quarkus
```
