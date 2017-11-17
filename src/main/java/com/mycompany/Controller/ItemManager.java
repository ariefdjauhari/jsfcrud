package com.mycompany.Controller;

import com.mycompany.Domain.Basket;
import com.mycompany.Entity.Item;
import com.mycompany.Service.ItemService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.List;

@ViewScoped
@ManagedBean
public class ItemManager {

    private Item item;

    private List<Item> items;

    private int quantity;

    @ManagedProperty("#{basket}")
    private Basket basket;

    @EJB
    private ItemService itemService;

    @PostConstruct
    public void init() {
        item = new Item();
        quantity = 1;
    }


    public void removeSelected() {
        itemService.remove(item.getId());
    }

    public void addItemToBasket() {
        basket.add(item, quantity);
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Result:",
                        "Item added to basket"));
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void loadOne() {
        item = itemService.findOne(item.getId());
    }

    public void loadAll() {
        items = itemService.findAll();
    }

    public void save() {
        itemService.save(item);
        item = new Item();
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Result:",
                        "Item saved"));
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

}
