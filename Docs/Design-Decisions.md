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

## 4. Decision  
For this project, I chose **Option A (Large Sequence NUMBER(19))** because:  
- Application is single-DB, not distributed  
- Sequence size is practically non-exhaustible for our use case  
- Keeps schema clean and integrates easily with Hibernate  

---

## 5. Future Considerations  
If the system evolves into a distributed microservice architecture with multiple DBs, UUIDs or a Snowflake ID generator should be considered.  

