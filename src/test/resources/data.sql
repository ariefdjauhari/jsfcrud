DELETE FROM item;
INSERT INTO item(id,name,description,price) VALUES (1,'book java','Unit Test Hibernate/JPA with in memory H2 Database','150');


DELETE FROM user_order;
INSERT INTO user_order(USER_ORDER_ID,CITY,NAME,ORDER_DATE,STREET,ZIP) VALUES (1,'bandung','arief', GETDATE(),'kopo','40228');

DELETE FROM ordered_item;
INSERT INTO ordered_item(ID,QUANTITY,ITEM_ID,USER_ORDER_ID) VALUES (1,'1','1','1');

