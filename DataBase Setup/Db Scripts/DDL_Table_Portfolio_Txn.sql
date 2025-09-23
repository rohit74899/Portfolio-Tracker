
create Table PORTFOLIO_TXN 
( pt_id Number,
  pt_user_id varchar(100),
  pt_Symbol  varchar(100),
  pt_Quantity Number,
  pt_Buy_Price Number
);

ALTER TABLE PORTFOLIO_TXN
Add CONSTRAINT Pk_Pt_Txnid PRIMARY KEY (pt_id,pt_user_id,pt_Symbol,pt_Quantity);

ALTER TABLE PORTFOLIO_TXN
MODIFY (PT_USER_ID NUMBER NOT NULL);

--MANY TO ONE RELATON ADDED 

ALTER TABLE PORTFOLIO_TXN
ADD CONSTRAINT Fk_Pt_User FOREIGN KEY (pt_user_id) REFERENCES ENTITY_MASTER(user_id);

