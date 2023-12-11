package de.telran.g_300523_m_be_shop.domain.interfaces;

import java.util.UUID;

public interface Customer {
    UUID getId();
    boolean isActive();
    String getName();
    Cart getCart();
}
