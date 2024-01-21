package com.abans.abans.controller;

import com.abans.abans.dto.ItemDto;
import com.abans.abans.service.ItemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/getAll")
    public List<ItemDto> getAllItemAbans(){
        return itemService.getAllItemAbans();
    }
}
