CREATE OR REPLACE TRIGGER Trg_Entity_Master_id
BEFORE INSERT ON entity_master
FOR EACH ROW
BEGIN
 IF :NEW.user_id IS NULL THEN
    SELECT entity_master_seq.NEXTVAL
    INTO :NEW.user_id
    FROM DUAL;
 END IF;
END;
/