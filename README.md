# spring-jpa-main
[Active] Spring Data JPA and Hibernate


# @Entity
 - database creation is easy to do with JPA and Hibernate by adding these two lines in application.properties
   - spring.jpa.generate-ddl=true
   - spring.jpa.hibernate.ddl-auto=create
     - create - create if database doesnt exist
     - update - will just look for changes but will NOT remove column
     - create-drop - create and drop schema whenever being deployed
     - validate - use when app is stable. can slow app deployment