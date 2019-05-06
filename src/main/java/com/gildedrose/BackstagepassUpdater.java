package com.gildedrose;

public class BackstagepassUpdater {

	public void update(Item item) {
		increaseQuality(item);
		decreaseSellIn(item);
		if (concertIsOver(item)) {
			dropQualityToZero(item);
		}
	}

	private void increaseQuality(Item item) {
		if (item.sellIn <= 5) {
			item.quality += 3;
		} else if (item.sellIn <= 10) {
			item.quality += 2;
		} else {
			item.quality += 1;
		}
		item.quality = Math.min(50, item.quality);
	}

	private void decreaseSellIn(Item item) {
		item.sellIn = item.sellIn - 1;
	}

	private boolean concertIsOver(Item item) {
		return item.sellIn < 0;
	}

	private void dropQualityToZero(Item item) {
		item.quality = 0;
	}

}
