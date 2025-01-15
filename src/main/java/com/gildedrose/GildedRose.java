package com.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            // Store all reused values in easy to understand variables
            int currentQuality = items[i].quality;
            int currentSellIn = items[i].sellIn;
            String currentName = items[i].name;
            ItemType type = items[i].type;

            // structure code into blocks for each ItemType
            /*
             * Section the Code into blocks of items of different types.
             * Inside the sections implement different Items based on unique behaviour (like having a quality cap, or a definite expiry date etc.).
             * This way Items can be added afterwards without changing the structure of the existing code.
             * Basic behaviour can be extracted while unuqie beahviour can be item specifid, this way we maintain the general to special principle.
             */
            currentSellIn--;

            if (type == ItemType.STATIC) {
                if (currentName.equals("Sulfuras, Hand of Ragnaros")) {
                    currentSellIn++;
                }
            } else if (type == ItemType.RIPING) {
                if (currentName.equals("Aged Brie")) {
                    if (currentQuality < 50) {
                        int sellInLessThanZero = currentSellIn < 0 ? 2 : 1;
                        if ((currentQuality + sellInLessThanZero) < 50) {
                            currentQuality += sellInLessThanZero;
                        } else {
                            currentQuality = 50;
                        }
                    }
                } else {
                    // base case
                    currentQuality++;
                }
            } else if (type == ItemType.EXPIRING) {
                if (currentName.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (currentSellIn < 0) {
                        currentQuality = 0;
                    } else {
                        // backstage tickets are useless after the concert
                        if (currentQuality < 50) {
                            currentQuality++;
                            int sellInLessThanEleven = currentSellIn < 11 ? 1 : 0;
                            int sellInLessThanSix = currentSellIn < 6 ? 1 : 0;
                            if (currentQuality + sellInLessThanEleven + sellInLessThanSix < 50) {
                                currentQuality = currentQuality + sellInLessThanEleven + sellInLessThanSix;
                            } else {
                                currentQuality = 50;
                            }
                        }
                    }
                } else {
                    // base case
                    currentQuality--;

                    if (currentSellIn < 0) {
                        currentQuality--;
                    }
                }
            }
            // enact changes
            items[i].quality = currentQuality;
            items[i].sellIn = currentSellIn;
        }
    }
}
