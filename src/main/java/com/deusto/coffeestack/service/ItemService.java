package com.deusto.coffeestack.service;

import com.deusto.coffeestack.dto.ItemCreateRequest;
import com.deusto.coffeestack.dto.ItemResponse;
import com.deusto.coffeestack.dto.ItemUpdateRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemService {
    Page<ItemResponse> list(Pageable pageable);
    ItemResponse getById(Long id);
    ItemResponse create(ItemCreateRequest request);
    ItemResponse update(Long id, ItemUpdateRequest request);
    void delete(Long id);
}
