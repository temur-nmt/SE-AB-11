package com.gildedrose;

public enum ItemType {
    EXPIRING, RIPING, STATIC;
}

// This enum contains all the different types of Items. This can be futher extended in case any new Items of special properties are added.
/*
 * Note that the different types are very broad by design, this way the implementation of new Items is easier to categorize. 
 * An item which has static quality can still have an expiry date etc. The actual implementation is up to the dev.
 */
