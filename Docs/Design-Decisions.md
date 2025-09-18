# Design Decision : Creation on Sequence to generate UNIQUE USer Id's 

## 1. Problem 
: Need to Generate Unique ID's for Clients in Table : Entity_Master.
  Using Oracle Sequence. but it will Exhaust (In long term)

    1. Sequence Runs Out -- Client Registrations Will Fail
    2. Sequence Cycles   -- will Violate Primary Key Constraint

# Option A : Large Sequence Number (NUMBER(19))
- Simple, efficient, fast indexing  
- Works for billions of records  
- Not globally unique across distributed DBs 

# Option B : Unique UUID (128-bit)
- Virtually infinite, unique across systems  
- Useful in microservices or distributed DB  
- Long, less human-readable, slower indexing  

# Option C: Snowflake IDs (Timestamp + Shard + Sequence) 
- Globally unique, time-ordered  
- Scales well in high-volume distributed systems  
- More complex implementation  

## 1.1. Decision  
For this project, I chose **Option A (Large Sequence NUMBER(19))** because:  
- Application is single-DB, not distributed  
- Sequence size is practically non-exhaustible for our use case  
- Keeps schema clean and integrates easily with Hibernate  

---

## 1.2. Future Considerations  
If the system evolves into a distributed microservice architecture with multiple DBs, UUIDs or a Snowflake ID generator should be considered.  


# Design Decision : Creation on Sequence to generate UNIQUE USer Id's 

## Problem 
: implement [Primary Key + Sequence] in 
            [Hibernate + Oracle]
            [While Inserting a New Record in Table ]
  To Assign a new Id for a User

## Option A : Database Trigger + Sequence (DB-driven)

-Java side: just @Id, no @GeneratedValue.
-DB side: trigger auto-assigns NEXTVAL from sequence.
Flow:
-Hibernate sends INSERT (with no ID or with NULL).
-Trigger fires → assigns ID.

Cons: Hibernate won’t know the generated ID unless you refresh the entity.
Error throws : So, just having a trigger in DB is not enough — Hibernate refuses to insert without knowing the ID plan. **org.hibernate.id.IdentifierGenerationException:**


## Option B : Hibernate + @SequenceGenerator (ORM-driven, best practice ✅)
-DB side: just a sequence, no trigger.
Flow:
-Hibernate queries NEXTVAL before insert.
-Uses it in the INSERT.
-Pros: Hibernate knows ID immediately.
-Used in: Most modern enterprise apps.

## Option C: Hibernate + GenerationType.TABLE (Table-based generator)

-Hibernate creates a separate table to simulate sequences.
-Rare in Oracle (because Oracle has real sequences).
-Mostly used in cross-database projects where some DBs don’t support sequences.

## 2.2 Decision : 
- For This Project I Choose **Option B : Hibernate + @SequenceGenerator** Beacuse 
- Hibernate and Db Are Both are Aware of Sequence Increment
- Hibernate queries the sequence directly → no trigger confusion.
- Both DB & Hibernate stay in sync (Hibernate knows the generated ID before insertion). 