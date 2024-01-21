package com.abans.abans.service.Impl;

import com.abans.abans.dto.ItemDto;
import com.abans.abans.entity.Item;
import com.abans.abans.repository.ItemRepo;
import com.abans.abans.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {
    private final ItemRepo itemRepo;

    public ItemServiceImpl(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    @Override
    public List<ItemDto> getAllItemAbans() {
        List<Item> itemList = itemRepo.findAll();
        List<ItemDto> itemDTOs = new ArrayList<>();
        itemList.forEach(
                item -> itemDTOs.add(new ItemDto(item.getId(), item.getBrand(), item.getName(), item.getPrice())));
        return itemDTOs;
    }
}
