package multithreading.service;

import multithreading.domain.Inventory;
import multithreading.domain.ProductOption;

import java.util.concurrent.CompletableFuture;

import static multithreading.util.CommonUtil.delay;

public class InventoryService {
    public Inventory addInventory(ProductOption productOption) {
        delay(500);
        //return Inventory.builder().count(2).build();
        return new Inventory().setCount(2);

    }
    public Inventory retrieveInventory(ProductOption productOption) {
        delay(500);
        //return Inventory.builder().count(2).build();
        return new Inventory().setCount(2);

    }
    public CompletableFuture<Inventory> addInventory_CF(ProductOption productOption) {

        return CompletableFuture.supplyAsync(() -> {
            delay(500);
            //return Inventory.builder().count(2).build();
            return new Inventory().setCount(2);
        });

    }
}
