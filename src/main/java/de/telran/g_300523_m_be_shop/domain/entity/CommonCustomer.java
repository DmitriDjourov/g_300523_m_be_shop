package de.telran.g_300523_m_be_shop.domain.entity;

import de.telran.g_300523_m_be_shop.domain.interfaces.Cart;
import de.telran.g_300523_m_be_shop.domain.interfaces.Customer;

import java.util.Objects;
import java.util.UUID;

public class CommonCustomer implements Customer {
    private UUID id;
    private boolean isActive;
    private String name;
    private Cart cart;//принцип слабой связанности, классы должны зависеть не от др. классов, а от интерфейсов

    public CommonCustomer() {
        this.id = UUID.randomUUID();
        this.isActive = true;
        this.cart = new CommonCart();
    }

    public CommonCustomer(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.isActive = true;
        this.cart = new CommonCart();
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Cart getCart() {
        return cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonCustomer that = (CommonCustomer) o;
        return isActive == that.isActive && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(cart, that.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, cart);
    }

    @Override
    public String toString() {
        return "CommonCustomer{" +
                "id=" + id +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", cart=" + cart +
                '}';
    }
}
