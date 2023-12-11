package de.telran.g_300523_m_be_shop.domain.interfaces;

import java.util.UUID;

public interface Product {
    UUID getId();
    boolean isActive();// геттер для boolean называется is
    String getName();
    double getPrice();

}
