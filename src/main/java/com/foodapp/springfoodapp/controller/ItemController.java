package com.foodapp.springfoodapp.controller;


import com.foodapp.springfoodapp.entiry.Item;
import com.foodapp.springfoodapp.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/item")
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/addItem")
    public ResponseEntity<Item> item(@RequestBody Item item) {
        Item saveItem = itemService.saveitem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveItem);
    }

    @PostMapping("/addMore")
    public ResponseEntity<List<Item>> addItems(@RequestBody List<Item> items) {
        List<Item> itemList = itemService.saveitems(items);
        return ResponseEntity.status(HttpStatus.CREATED).body(itemList);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Item>> fetchAllItems() {
        List<Item> getItemList = itemService.getItems();
        return ResponseEntity.status(HttpStatus.CREATED).body(getItemList);
    }

    @DeleteMapping("/delete/{itemId}")
    public ResponseEntity<String> deleteItem(@PathVariable int itemId) {
        String deleteItems = itemService.deleteitemById(itemId);
        return ResponseEntity.status(HttpStatus.CREATED).body(deleteItems);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Item> updateItem(@RequestBody Item updateitem,@PathVariable int id) {
        Item updateItems = itemService.updateItems(updateitem, id);
        return ResponseEntity.status(HttpStatus.CREATED).body(updateitem);
    }

}
