
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