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
# @Table
    - table specifics
    - PhysicalNamingStrategyStandardImpl
        - tells the hibernate to force uppercase naming
# @Columns
    - override names or add inf 
        - columnDefinition, scale, insertable, length, unique, nullable, updatable
# @PersistenceContext
    - injects entity manager
# @Service 
    - location of business logic
# @Repository
    - database integration
# @Transactional 
    - beginning of transaction
