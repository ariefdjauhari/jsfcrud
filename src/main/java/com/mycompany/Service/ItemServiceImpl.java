package com.mycompany.Service;

import com.mycompany.Entity.Item;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class ItemServiceImpl implements ItemService {

    @PersistenceContext(name="Deneme_Deneme_PU")
    private EntityManager entityManager;

    @Override
    public List<Item> findAll() {
        TypedQuery<Item> Items = entityManager.createNamedQuery("allItem", Item.class);
        return Items.getResultList();
    }

    @Override
    public Item findOne(int id) {
        return entityManager.find(Item.class, id);
    }

    @Override
    public void save(Item item) {
        if(item.getId() == null) {
            entityManager.persist(item);
        } else {
            entityManager.merge(item);
        }
    }

    @Override
    public void remove(int id) {
        entityManager.remove(entityManager.find(Item.class, id));
    }

}
