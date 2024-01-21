package com.web.web.service.Impl;

import com.web.web.controller.WebClient;
import com.web.web.dto.ItemDto;
import com.web.web.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

    private final WebClient webClient;

    public ItemServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public List<ItemDto> getAllItems() throws Exception {
        log.info("hit getAll Abans Items");
        try {
            List<ItemDto> newList = new ArrayList<ItemDto>();

            List<ItemDto> listDTO1 = webClient.getItemAbans();
            List<ItemDto> listDTO2 = webClient.getItemSinger();

            if(listDTO1.isEmpty()){
                throw new Exception("Abans item empty");
            }
            if (listDTO2.isEmpty()) {
				throw new Exception("cannot get singer data..");
			}
            newList.addAll(listDTO1);
            newList.addAll(listDTO2);
            return newList;

        }catch (Exception e){
               throw new Exception("Error occur during get abans item details");
        }

    }
}
