package com.example.lostandfound.controller;

import com.example.lostandfound.entity.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ItemService {
    public Item createItem(Item item) {
        log.info("Creating item: {}", item.getName());
        return itemRepository.save(item);
    }
}


