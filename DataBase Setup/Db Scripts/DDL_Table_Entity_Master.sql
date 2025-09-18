
create table Entity_Master
( user_id Varchar(100) ,
  username varchar(100),
  passwd varchar(100),
  email varchar(100)
);

DESC Entity_Master;
ALTER TABLE Entity_Master
MODIFY user_id NUMBER NOT NULL;

Alter table Entity_Master
Add CONSTRAINT Pk_Entity PRIMARY KEY (user_id,username);


