package ru.prusov.architecture.shopstore.inMemoryModel;

import ru.prusov.architecture.shopstore.modelElements.Order;

import java.util.Collection;
import java.util.HashSet;

public class Store {

    private Collection<Order> orders = new HashSet<>();

    public boolean addOrder(Order order){
        orders.add(order);
        return true;
    }

    public boolean canselOrder(int id){
        //TODO: Отмена заказа
        return true;
    }

    public boolean paymentOrder(int id){
        //TODO: Оплата заказа
        return true;
    }
}
