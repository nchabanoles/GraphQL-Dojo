# GraphQL-Dojo
A step-by-step exercice to get familiar with Java server implementation of a GraphQL API

For each step of this dojo, there is a corresponding branch on this repository.
By convention the branch name starts with the step number, e.g. the 2nd step of the exercice is called 2_Something_To_do.

The readme.md file will differ on each branch and give you the general objective of the exercice.
Files to be modified, will contain comments to help you understand what to do.

In the 3_extend_schema branch (current), we are going to expose more queries and types.

## Expose Quotations

### Update schema definition
1) Declare Quotation type in the schema.graphqls schema file
2) Add a allQuotations query in the schema.graphqls schema file
3) Add a allQuotations method in the Query bean

*Note:* At this stage if you browse http://localhost:9000/graphiql you should be able to list quotations.

4) Declare a new quotations attribute for the type Request in the schema definition
5) Create a RequestResolver class that implements GraphQLResolver and exposed a getQuotations(Request) method
6) Enjoy you graph of objects!

### Build command
./gradlew build

After the project is built, start the server and check that the application is properly displayed.

### Start server
java -jar build/libs/graphql-dojo-0.1.0.jar

*Note:* to work properly this code base requires a Bonita server to be available on the network. By default a server has manually been deployed on http://192.168.1.62:8080/bonita

### Browse GraphQL APIs
http://localhost:9000/graphiql

## To go further
### Manage suppliers
### Expose all the attributes of all objects
### Expose methods to find requests by status