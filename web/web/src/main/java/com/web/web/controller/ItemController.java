package com.web.web.controller;

import com.web.web.dto.ItemDto;
import com.web.web.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@RequestMapping("api/v1/web")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/Ab")
    public List<ItemDto> getAllItemsAb() throws Exception {
        log.info("getAllAb hit controller");
        return itemService.getAllItems();
    }
//    @GetMapping("/singer")
//    public List<ItemDto> getAllItemsSinger() throws Exception {
//        log.info("getAllAb hit controller");
//        return itemService.getAllItems();
//    }
}
