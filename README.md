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

#--- JOIN TYPES ----
    - used to bind collections of objects to the databse
    - Four types of Join:
        1. @OneToOne
            - most common
            - paired with @ManyToOne
            - mappedBy
        2. @OneToMany
        3. @ManyToOne
        4. @ManyToMany

    - Configurations
        - Unidirectional
        - Bidirectional
        - Cascading
# Fetch Types
    - lazy db - database query when the property is called
    - eager db - database query when object is CREATED
# JPQL (java persistence query language)
    - JPQL is not SQL
    - centered around objects
    - example
        Query q = em.createQuery("Select r from Registration")