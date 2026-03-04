package com.deusto.coffeestack.mapper;

import com.deusto.coffeestack.domain.Item;
import com.deusto.coffeestack.dto.ItemResponse;

public final class ItemMapper {
    private ItemMapper() { }

    public static ItemResponse toResponse(Item item) {
        return new ItemResponse(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.getCreatedAt()
        );
    }
}
