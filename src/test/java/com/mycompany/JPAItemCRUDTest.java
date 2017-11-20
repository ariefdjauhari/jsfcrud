package com.mycompany;

import com.mycompany.Entity.Item;
import org.junit.Test;

import javax.persistence.TypedQuery;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JPAItemCRUDTest extends JPAHibernateTest {

    @Test
    public void testGetObjectById_success() {
        TypedQuery<Item> item = em.createNamedQuery("allItem", Item.class);
        assertNotNull(item);
    }

    @Test
    public void testGetAll_success() {
        List<Item> items = em.createNamedQuery("allItem", Item.class).getResultList();
        assertEquals(0, items.size());
    }

    @Test
    public void testPersist_success() {
        em.getTransaction().begin();
        em.persist(constructItem("Java book",
                "Learn how to use Java in 21 days", 300));
        em.getTransaction().commit();

        List<Item> items = em.createNamedQuery("allItem", Item.class).getResultList();

        assertNotNull(items);
        assertEquals(1, items.size());
    }

    @Test
    public void testDelete_success(){
        Item item = em.find(Item.class, 1);

        em.getTransaction().begin();
        em.remove(item);
        em.getTransaction().commit();

        List<Item> items = em.createNamedQuery("allItem", Item.class).getResultList();

        assertEquals(0, items.size());
    }
    private Item constructItem(String name, String description, double price) {
        Item item = new Item();
        item.setName(name);
        item.setDescription(description);
        item.setPrice(price);
        return item;
    }
}
