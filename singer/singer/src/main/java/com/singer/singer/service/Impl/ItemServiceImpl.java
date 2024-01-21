package com.singer.singer.service.Impl;
import com.singer.singer.dto.ItemDto;
import com.singer.singer.entity.Item;
import com.singer.singer.repository.ItemRepo;
import com.singer.singer.service.ItemService;
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
    public List<ItemDto> getAllItemSinger() {
        List<Item> itemList = itemRepo.findAll();
        List<ItemDto> itemDTOs = new ArrayList<>();
        itemList.forEach(
                item -> itemDTOs.add(new ItemDto(item.getId(), item.getBrand(), item.getName(), item.getPrice())));
        return itemDTOs;
    }
}
