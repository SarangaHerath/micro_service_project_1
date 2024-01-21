package com.web.web.controller;

import com.web.web.dto.ItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Slf4j
public class WebClient {

    public List<ItemDto> getItemAbans() {
        log.info("start get abans data :");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8083/api/v1/item/getAll" + "", List.class);
    }
    public List<ItemDto> getItemSinger() {
        log.info("start get abans data :");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8084/api/v1/item/getAll" + "", List.class);
    }


}
