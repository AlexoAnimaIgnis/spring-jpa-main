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

# Projection
    - Presents Object to the UI
    - Objects added using JPQL
    - Projection Objects can be JPA Entities
    - Constructor for the projection is Needd

# NamedQueries
    - example @NamedQueries({@NamedQuery(name=Registration.FIND_REGISTRATION_REPORTS,
                query =Registration.FIND_REGISTRATION_REPORTS_JPQL)})
    - clean up adhoc JPQL, cleaner than adhoc jpql
    - not required, but focuses on the domain
    - Named Parameters

# Updates
    - Persist method is just used for Creates
    - Merge is used for Updating a record