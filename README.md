# Hello World Spring Boot API

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