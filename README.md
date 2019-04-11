# GraphQL-Dojo
A step-by-step exercice to get familiar with Java server implementation of a GraphQL API

For each step of this dojo, there is a corresponding branch on this repository.
By convention the branch name starts with the step number, e.g. the 2nd step of the exercice is called 2_Something_To_do.

The readme.md file will differ on each branch and give you the general objective of the exercice.
Files to be modified, will contain comments to help you understand what to do.

In the 2_init_GraphQL branch (current), we are going to build expose our first GraphQL endpoint.

## Install a GraphQL client
To help us test (manually) our GraphQL endpoint we will use a client application that allows us to discover, browse and call easyly our APIs: GraphiQL.


### Add GraphiQL deps
1) Un-comment the GraphiQL tool deps in the build.gradle

*Note:* At this stage if you browse http://localhost:9000/graphiql you should see the GraphiQL client. But we did not expose any GraphQL endpoint yet...

2) Un-comment the minimal list of deps needed to use GraphQL in a Java project. This will allow some magic later on. (wait and see...)

## Expose a GraphQL endpoint
1) Read the schema.graphqls schema definition
2) Create a new bean Query class that implements GraphQLQueryResolver and exposes the method described in the schema
Here the magic happens, the Spring Boot GraphQL starter automatically finds the schema files and the GraphQL java tools automaically wire up the beans to expose the GraphQL end point on /graphql.
3) Use GraphiQL to list all requests from the Bonita BDM

### Build command
./gradlew build

After the project is built, start the server and check that the application is properly displayed.

### Start server
java -jar build/libs/graphql-dojo-0.1.0.jar

*Note:* to work properly this code base requires a Bonita server to be available on the network. By default a server has manually been deployed on http://192.168.1.62:8080/bonita

### Browse GraphQL APIs
http://localhost:9000/graphiql