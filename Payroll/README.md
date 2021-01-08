Big picture: We’re going to create a simple payroll service that manages the employees of a company. 
We’ll store employee objects in a (H2 in-memory) database, and access them (via something called JPA). 
Then we’ll wrap that with something that will allow access over the internet (called the Spring MVC layer).

@Entity is a JPA annotation to make this object ready for storage in a JPA-based data store.

Spring Data JPA repositories are interfaces with methods supporting creating, reading, updating, and deleting records against a back end data store. Some repositories also support data paging, and sorting, where appropriate. Spring Data synthesizes implementations based on conventions found in the naming of the methods in the interface