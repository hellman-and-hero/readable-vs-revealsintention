package com.gildedrose;

public class BackstagepassUpdater {

	public void update(Item item) {
		if (!hasMaxQuality(item)) {
			increaseQuality(item);

			if (item.sellIn < 11 && !hasMaxQuality(item)) {
				increaseQuality(item);
			}

			if (item.sellIn < 6 && !hasMaxQuality(item)) {
				increaseQuality(item);
			}
		}

		decreaseSellIn(item);

		if (item.sellIn < 0) {
			item.quality = 0;
		}
	}

	private void decreaseSellIn(Item item) {
		item.sellIn = item.sellIn - 1;
	}

	private boolean hasMaxQuality(Item item) {
		return item.quality >= 50;
	}

	private int increaseQuality(Item item) {
		return item.quality = item.quality + 1;
	}

}
