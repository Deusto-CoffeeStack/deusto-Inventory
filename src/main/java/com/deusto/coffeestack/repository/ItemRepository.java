package com.deusto.coffeestack.repository;

import com.deusto.coffeestack.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
