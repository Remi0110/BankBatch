# BankBatch

BankBatch is a project who demonstrate a Data Batch Processing using Spring Batch.
The Job implemented here allows to reads data from a CSV file, processes it and writes it into a database.

## Technologies
 - Spring Boot
 - Spring Batch
 - Spring MVC
 - Spring Data
 - JPA
 - H2 Database


## Getting Started
### Prerequisites
Please install the following tools:

- Java
- Maven

### Running App
After installating the tools and clone the project please go to the folder that contains the pom.xml file and execute the below command:

`mvn clean install`

You will find the CSV file (data.csv) in the resources folder.

### Execution

The Job is executed from a REST controller.
After running app from BankBatchApplication.java, please enter the following URL in your browser for starting the Job.

`http://localhost:8080/startJob`

You can then see at the following URL below that the data has been correctly inserted in the database.

`http://localhost:8080/h2-console`

Another process is triggered at the same time which calculates a total debit or credit depending on the type of transaction, the JSON result is accessible at the following URL:

`http://localhost:8080/analytics`



