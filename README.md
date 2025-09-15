# Portfolio-Tracker


A Java-based application to track and manage stock portfolios.  
Currently implementing Hibernate CRUD operations as foundation, will extend to Spring Boot and REST APIs in later milestones.

## 🛠 Tech Stack
- **Language**: Java 17  
- **ORM**: Hibernate (JPA)  
- **Database**: Oracle 12c  
- **Build Tool**: Maven  
- **Version Control**: Git (feature → dev → main workflow) 

## 🚀 Features Implemented
- Hibernate utility class (`HibernateUtil`) with reusable static `SessionFactory`.  
- CRUD operations for:  
  - `Entity_Master` (user details)  
  - `Portfolio_Txn` (portfolio transactions)  
- Database schema setup with primary keys & indexing.  
- Git branching strategy: `main` (stable), `dev` (integration), `feature/*` (individual tasks).  


## 🔮 Upcoming Milestones
- Add DAO layer with CRUD service methods.  
- Integrate with Spring Boot for REST APIs.  
- Build user authentication & role-based access.  
- Add frontend dashboard (React or Thymeleaf). 