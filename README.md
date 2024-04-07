# Render public api

This is a simple example of how to deploy a public API to the render.com for free.


## Requirements
* Java 21
* Maven 3.9.6
* Spring Boot 3.2.4
* Dockerfile


## How to run
1. Clone this repository
2. Run the following command
```shell
mvn spring-boot:run
```
1. Open your browser and go to http://localhost:8080/api/v1/hello
2. You should see the following message
```json
{
  "message": "Hello, World!"
}
```

## How to build a docker image
[Dockerfile](Dockerfile) is provided in the root directory of this repository. You can build a docker image by running the following command.
```shell
docker build -t public-api .
```

## How to run a docker container
You can run a docker container by running the following command.
```shell
docker run -p 8080:8080 public-api
```

## How to publish the docker image to the docker hub
1. Create a repository on the docker hub
2. Tag the docker image
```shell
docker tag public-api:latest cevheri/public-api:latest
```
1. Login to the docker hub
```shell
docker login
```
1. Push the docker image
```shell
docker push cevheri/public-api:latest
```

## How to deploy the public API to the render.com
1. Create an account on the render.com
2. Create a new web service
3. Select the public-api repository from the GitHub
4. Select the main branch
5. Click the deploy button
6. Open the public URL
7. You should see the following message
```json
{
  "message": "Hello, World!"
}
```

## Conclusion
This is a simple example of how to deploy a public API to the render.com for free. You can use this example as a starting point for your project.




