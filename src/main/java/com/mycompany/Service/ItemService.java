package com.mycompany.Service;

import com.mycompany.Entity.Item;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ItemService {

    List<Item> findAll();

    Item findOne(int id);

    void save(Item item);

    void remove(int id);
}
