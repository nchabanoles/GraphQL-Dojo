# GraphQL-Dojo
A step-by-step exercice to get familiar with Java server implementation of a GraphQL API

For each step of this dojo, there is a corresponding branch on this repository.
By convention the branch name starts with the step number, e.g. the 2nd step of the exercice is called 2_Something_To_do.

The readme.md file will differ on each branch and give you the general objective of the exercice.
Files to be modified, will contain comments to help you understand what to do.

In the 1_init_DAO branch (current), we are going to build a new Repository to access to our Data.
Our data is stored in a Bonita BDM.

## Add Bonita deps
This example relies on Bonita 7.9.0.W5 (the latest tagged version at the time of writing).
Make sure you have this dependency available locally or on a Maven repository visible on the network.
Moreover you will need the bdm-client deps describing the Procurement 1.0 application data.

*Note:* the easiest to get those deps is to start a Bonita Studio locally and install the procurement example available in the Studio Welcome Page.

If the compilation fails (prior to any change) it means that you do not have all the dependencies resolved properly.

## Create the RequestRepository
1) Following the example of existing repositories, create a new RequestRepository class. On this repository expose a 'find' method that returns a list of 'Request'.
2) Update your stats endpoint to provide users with the information on how many requests are currently in the system.
3) Check that the stats are displayed properly by browsing the application

### Build command
./gradlew build

After the project is built, start the server and check that the application is properly displayed.

### Start server
java -jar build/libs/graphql-dojo-0.1.0.jar

*Note:* to work properly this code base requires a Bonita server to be available on the network. By default a server has manually been deployed on http://192.168.1.62:8080/bonita

### Browse application
http://localhost:9000/rest/stats