package com.mycompany.Service;

import com.mycompany.Domain.Basket;
import com.mycompany.Entity.UserOrder;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserOrderService {

    List<UserOrder> findAll();

    UserOrder findOne(int id);

    void save(UserOrder userOrder, Basket basket);

    List<UserOrder> findAllWithItems();

    void remove(int id);

    int count();
}
