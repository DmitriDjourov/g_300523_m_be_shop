package de.telran.g_300523_m_be_shop.domain.interfaces;

import java.util.List;
import java.util.UUID;

public interface Cart {
    UUID getId();
    List<Product> getProducts();
    void addProduct(Product product);
    void addProducts(Product...products);
    List<Product> getActiveProducts();
    void deleteProductById(UUID uuid);
    void deleteAllProducts();
    double getTotalPrice();
    double getAveragePrice();
}
