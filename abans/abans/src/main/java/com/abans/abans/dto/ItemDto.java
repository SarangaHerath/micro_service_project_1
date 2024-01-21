package com.abans.abans.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ItemDto {
    private int id;
    private String brand;
    private String name;
    private double price;
}
