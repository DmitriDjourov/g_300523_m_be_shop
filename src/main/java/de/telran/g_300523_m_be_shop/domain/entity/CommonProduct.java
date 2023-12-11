package de.telran.g_300523_m_be_shop.domain.entity;

import de.telran.g_300523_m_be_shop.domain.interfaces.Product;

import java.util.Objects;
import java.util.UUID;

public class CommonProduct implements Product {
    private UUID id;//генерировать
    private boolean isActive;//в конструктор не передадем, каждый новый продукт - активный
    private String name;
    private double price;
    public CommonProduct(){
        this.isActive = true;
        this.id = UUID.randomUUID();
    }
    public CommonProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.isActive = true;
        this.id = UUID.randomUUID();
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
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonProduct that = (CommonProduct) o;
        return isActive == that.isActive && Double.compare(price, that.price) == 0 && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, price);
    }

    @Override
    public String toString() {
        return "CommonProduct{" +
                "id=" + id +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
