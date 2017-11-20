package com.mycompany.Entity;

import com.mycompany.Entity.OrderedItem;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-20T11:25:49")
@StaticMetamodel(UserOrder.class)
public class UserOrder_ { 

    public static volatile SingularAttribute<UserOrder, String> zip;
    public static volatile SingularAttribute<UserOrder, String> city;
    public static volatile SingularAttribute<UserOrder, String> street;
    public static volatile SingularAttribute<UserOrder, String> name;
    public static volatile ListAttribute<UserOrder, OrderedItem> orderedItems;
    public static volatile SingularAttribute<UserOrder, Integer> id;
    public static volatile SingularAttribute<UserOrder, Date> orderDate;

}