# Example of CRUD with JSR-371 and MongoDB

Simple example of using JSR-371 together with MongoDB to do CRUD operations.

#Resources Used
 - Java 8
- [Glassfish-5.0](http://download.oracle.com/glassfish/5.0/release/glassfish-5.0-web.zip) or [Payara Server 164](http://cta-redirect.hubspot.com/cta/redirect/334594/6c4914a9-26de-4da5-b0fe-cd9f01ed1bea)
- Apache Maven 3.3.9
- MongoDB 3.4
- Eclipse  Oxygen Release Milestone 3 (4.7.0 M3)

# Run

- Start **MongoDB** default port=27017 with the command in the Prompt / Shell: `mongod` 
- Import Project Maven : ** File -> Import -> Maven -> Existing Maven Projects** OR **File -> Open Projects from File System**
- **Run As - > Run on Server -> GlassFish or Payara**
- Test by accessing the address : http://localhost:yourdoor/MVC1.0.Ozark/
