# V. Bibliography Management System

<br>Write an application that can manage a catalog of resources (bibliographic references), such as books, articles, etc.
<br>These resources might be represented by files in the local file system or a Web address. Apart from a unique
<br>identifier, a title and its location, a resource may have additional properties such as author(s), what year it was
<br>publihsed, description, etc.

<br>
Example of entries in the catalog might be:
<br><br>
{"id":"knuth67", "title":"The Art of Computer Programming", "location":"d:/books/programming/tacp.ps", "year":"1967", "author":"Donald E. Knuth", "type": "book"};  
<br>{"id":"java17", "title":"The Java Language Specification", "location":"https://docs.oracle.com/javase/specs/jls/se17/html/index.html", "year":"2021", "author":"James Gosling & others"};  <br>
<br>The main specifications of the application are:

## 1. Basic requirements


- [x] a. Create an object-oriented model of the problem. You should have at least the following classes: Catalog and Item. The items should have at least a unique identifier, a title and its location. Consider using an interface or an abstract class in order to describe the items in a catalog.
- [x] b. Implement the following methods representing commands that will manage the content of the catalog:
  - [x]   i.add: adds a new entry into the catalog;
  - [x]   ii.toString: a textual representation of the catalog;
  - [x]   iii.save: saves the catalog to an external file using JSON format; you may use Jackson or other library;
  - [x]   iv. load: loads the catalog from an external file.


#### Proof :

## 2. Expanding and reworking features

- [ ] a. Represent the commands using classes instead of methods. Use an interface or an abstract class in order to desribe a generic command.
- [ ] b. Implement the commands load, list, view, report (create the classes AddCommand, ListCommand, etc.).
  - [ ] i. list: prints the list of items on the screen;
  - [ ] ii. view: opens an item using the native operating system application (see the Desktop class);
  - [ ] iii. report: creates (and opens) an HTML report representing the content of the catalog.
<br>Use a template engine such as FreeMarker or Velocity, in order to create the HTML report.
  - [ ] Use Apache Tika in order to extract metadata from your catalog items and implement the command info in order to display them.
- [ ] c. The application will signal invalid date or the commands that are not valid using custom exceptions.
- [ ] d. The final form of the application will be an executable JAR archive. Identify the generated archive and launch the application from the console, using the JAR.

#### Proof :

## 3. Advanced features

- [ ] a. Suppose there is an official set of concepts (keywords) C, and that each item has a list of such concepts (example of such a classification system). Evolve your model in order to support this new feature.
- [ ] b. Write an algorithm that determines:
  - [ ] i. the largest set of pairs (item, concept) such that all items and all concepts in this set are distinct.
  - [ ] ii. the smallest set of pairs (item, concept) such that all items and all concepts are present in at least one pair.
- [ ] c. Create large instances of the problem and test your algorithm.


#### Proof :

