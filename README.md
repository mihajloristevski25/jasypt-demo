# Jasypt-Demo
Encrypting sensitive data using Jasypt in a Spring Boot Application

## Prerequisites
* Java JDK 17

## Installation

Clone the Github Repository or download the zip file

* Get the project from GIT "git clone https://github.com/mihajloristevski25/jasypt-demo.git"
* Set datasource url of your H2 DB application.properties -> spring.datasource.url
* Set H2 user value into application.properties -> spring.datasource.username

## Usage

* Open the root directory inside of it is a jar file called jasypt-1.9.3.jar you will need this file to encrypt the value.

* Use the folowing command to generate the encrypted value

      java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input=<value-to-encrypt> password=<secret-key> algorithm=PBEWithMD5AndDES

* Set the password for the DB in an Environment variable

* Package the app in a jar using maven command

        mvn clean package -DskipTests

* In the target folder in root directory is the jar
* To start the Application use the folowing command

       java -Xms256m -Xmx512m -Djasypt.encryptor.password=<secret-key> -Djasypt.encryptor.algorithm=PBEWithMD5AndDES -jar jasypt-demo-0.0.1-SNAPSHOT.jar

* Open the browser and on
  http://localhost:8080/h2-console and enter your credentials and log in the database


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License