# Hello World Spring Boot API

## Prerequisite
1. The project `jar` must be built before the docker build.
2. If the `target` folder doesn't exist, run the following command:
   ```
   $ mvn clean package
   ```

## Setup
1. Make sure Docker engine is running
2. Build the docker image using the command:
    ```bash
    $ docker build -t spring-boot-docker:spring-docker .
    ```
3. Run the container:
    ```
    $ docker run -p 8080:8080 spring-boot-docker:spring-docker .
    ```
4. Test by visiting the endpoint: `http://localhost:8080/`

## Changing API Version
1. Open `pom.xml`
2. Update the `version` element under `project`
3. **NOTE**: If the version is changed, the `jar` file name must be updated with the correct version in the Dockerfile 

## API Endpoints
1. Root - `GET` /
2. Greet - `GET` /greet/{name}
3. Health Check - `GET` /health/ready
4. Version Check - `GET` /version