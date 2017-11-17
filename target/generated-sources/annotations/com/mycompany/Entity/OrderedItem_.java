package com.mycompany.Entity;

import com.mycompany.Entity.Item;
import com.mycompany.Entity.UserOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-17T16:33:39")
@StaticMetamodel(OrderedItem.class)
public class OrderedItem_ { 

    public static volatile SingularAttribute<OrderedItem, Item> item;
    public static volatile SingularAttribute<OrderedItem, Integer> quantity;
    public static volatile SingularAttribute<OrderedItem, UserOrder> userOrder;
    public static volatile SingularAttribute<OrderedItem, Integer> id;

}