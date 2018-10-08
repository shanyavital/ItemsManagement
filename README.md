# ItemsManagement

The project using in the following technologies:

- Java
- Spring boot
- Swagger
- REST API/JSON
- Docker
- AngularJS 

Spring-boot application with a REST controller, which expose a Swagger API catalog.

The application expose the following APIs:

- List of the inventory items list (item no, name, amount, inventory code)
- Read item details (by item no)
- Withdrawal quantity of a specific item from stock
- Deposit quantity of a specific item to stock
- Add item to stock
- Delete an item from stock  


Data persisted on H2 DB using JPA.

Link to Docker hub (Without Angular):
https://hub.docker.com/r/shanyavital/itemsmanagement/

Instructions:
- docker pull shanyavital/itemsmanagement
- docker run -p 8080:8080 -t shanyavital/itemsmanagement

and then open http://localhost:8080/item

for Swagger API catalog go to :  http://localhost:8080/swagger-ui.html

