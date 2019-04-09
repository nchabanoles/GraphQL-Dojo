# GraphQL-Dojo
A step-by-step exercice to get familiar with Java server implementation of a GraphQL API

For each step of this dojo, there is a corresponding branch on this repository.  
By convention the branch name starts with the step number, e.g. the 2nd step of the exercice is called 2_Something_To_do.  

The readme.md file will differ on each branch and give you the general objective of the exercice.  
Files to be modified, will contain comments to help you understand what to do.

The master branch (current), is a pre-requisite step, to make sure your environment is setup properly to execute the provided code. Once you have successfully completed a step, please switch to the next branch.

## Prerequisite
Please clone this repository and build the provided project.

### Build command
./gradlew build

After the project is built, start the server and check that the application is properly displayed.

### Start server
java -jar build/libs/graphql-dojo-0.1.0.jar

### Browse application
open http://localhost:9000/
