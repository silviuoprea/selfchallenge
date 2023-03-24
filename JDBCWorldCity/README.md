# VIII. JDBC - World Cities
Write an application that allows to connect to a relational database by using JDBC, submit SQL statements and display the results.

<br>The main specifications of the application are:
<br>


## 1. Basic requirements


- [x] a. Create a relational database using any RDBMS (Oracle, Postgres, MySql, Java DB, etc.).
- [ ] b. Write an SQL script that will create the following tables:
  - [ ] i. countries: id, name, code, continent
  - [ ] ii. continents: id, name
- [ ] c. Update pom.xml, in order to add the database driver to the project libraries.
- [ ] d. Create a singleton class in order to manage a connection to the database.
- [ ] e. Create DAO classes that offer methods for creating countries and continents, and finding them by their ids and names;
- [ ] f. Implement a simple test using your classes.


#### Proof :

## 2. Expanding and reworking features

- [ ] a. Create the necessary table in order to store cities in your database. A city may contain: id, country, name, capital(0/1), latitude, longitude
- [ ] b. Create an object-oriented model of the data managed by the application.
- [ ] c. Create a tool to import data from a real dataset: World capitals gps or other.
- [ ] d. Display the distances between various cities in the world.
- [ ] e. Create a 2D map (using Swing or JavaFX) and draw on it the cities at their corresponding locations.

#### Proof :

## 3. Advanced features

- [ ] a. Use a connection pool in order to manage database connections, such as C3PO, HikariCP or Apache Commons DBCP.
- [ ] b. Two cities are sisters (or twins) if they have a form of legal or social agreement between for the purpose of promoting cultural and commercial ties.
<br> Using a ThreadPoolExecutor create and insert into your database a large number of fake cities (≥1000) and random sister relationships among them (the sisterhood probability should be low).
- [ ] c. Using Bron Kerbosch algorithm determine the sets of cities (inclusionwise maximal, with at least 3 elements) that are all sisters with each other.


#### Proof :

