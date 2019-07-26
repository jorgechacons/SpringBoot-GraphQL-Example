# SpringBoot-GraphQL-Example

## to build

```bash
mvn clean install


## to deploy/run

```bash
java -jar demo-0.0.1-SNAPSHOT.jar


## to build docker image

```bash
docker build -t demoSpringBootGraphQL .


## to run docker image

```bash
docker run -p 8080:8080 demoSpringBootGraphQL

## to test with GraphiQL

```bash
http://localhost:8080/graphiql