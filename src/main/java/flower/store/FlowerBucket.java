package flower.store;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    @Getter
    private final List<FlowerPack> bucket = new ArrayList<>();
    public void add(FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack pack : bucket) {
            price += pack.getPrice();
        }
        return price;
    }
}
