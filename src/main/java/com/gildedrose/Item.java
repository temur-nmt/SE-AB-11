package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    // this attribute is used to classify different item behaviours by grouping them together based on whether their attributes decrease, increase or stay the same over time
    public ItemType type;

    public Item(String name, int sellIn, int quality, ItemType type) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.type = type;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
