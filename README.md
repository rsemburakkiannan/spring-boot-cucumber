# RDBMS and NoSQL embedded servers in single application with Cucumber tests

There are two embedded servers. H2 for RDBMS and flapdoodle for embedded Mongo.

## **How to Run the application**
Start the server using the following gradle command:
``gradlew bootRun``

Following are the available end points to access the version information
1. [http://localhost:8080/rdbms/version](http://localhost:8080/rdbms/version)  to retrieve RDBMS version
2. [http://localhost:8080/nosql/version](http://localhost:8080/nosql/version) to retrieve NoSQL version

## **How to Run end-to-end Cucumber test**
Following gradle command used for running e2e cucumber test
``gradlew e2e``