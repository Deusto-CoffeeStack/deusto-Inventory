package com.deusto.coffeestack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ItemCreateRequest {

    @NotBlank
    @Size(max = 120)
    private String name;

    @Size(max = 500)
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
