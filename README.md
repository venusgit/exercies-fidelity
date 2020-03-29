
#Fidelity - currency changes
#exercies-fidelity 
Exercise details -

Assume you are working on a large Java enterprise application. Your requirement is to build a feature to take in a balance and convert it into denominations (bills/coins). The intent is to convert the balance into the least number of bills/coins. The balance is expressed as the lowest unit of currency (e.g. pennies for USD).

Examples (USD):

Given the balance 87, the function will return 3 Quarter, 1 Dime, 2 Penny coins.

Given the balance 287, the function will return 2 Dollar, 3 Quarter, 1 Dime, 2 Penny coins.

 

Please make use of Object Oriented analysis and design techniques in your implementation so that the code is easy to understand, maintain and enhancements to the feature can be easily accommodated in the future.

 

Example of a feature enhancement:

 

Distribute currency from different countries that use different denominations:

 

e.g. for Euro (EURO): Given the balance 287, the function will return 1 two euro, 1 50c, 1 20c, 1 10c, 1 5c, and 2 1c coins

Please checkout the code from git hub (develop branch)

Run the code by running SpringBootDemoApplication class as a springboot application

To execute the Restful service you need to use any Rest Client (e.g. Postman, SOAPUi)

Sample 

http://localhost:8080/currency/changes/usd/287

http://localhost:8080/currency/changes/usd/87

http://localhost:8080/currency/changes/euro/287


