package com.web.web.service;

import com.web.web.dto.ItemDto;

import java.util.List;

public interface ItemService {
    List<ItemDto> getAllItems() throws Exception;
}
