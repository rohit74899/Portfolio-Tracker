
create table Entity_Master
( user_id Varchar(100) ,
  username varchar(100),
  passwd varchar(100),
  email varchar(100)
);

DESC Entity_Master;
ALTER TABLE Entity_Master
MODIFY user_id NUMBER NOT NULL;

/*One To Many Relation [Many Txns[1][2][3] ---> to Single User [X]*/
/*
ALTER TABLE Entity_Master
DROP CONSTRAINT Pk_Entity
*/

Alter table Entity_Master
Add CONSTRAINT Pk_Entity PRIMARY KEY (user_id);




