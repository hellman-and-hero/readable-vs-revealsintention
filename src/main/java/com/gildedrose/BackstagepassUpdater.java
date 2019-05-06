package com.gildedrose;

public class BackstagepassUpdater {

	public void update(Item item) {
		if (!hasMaxQuality(item)) {
			increaseQualityByOne(item);
			if (sellInLessThan(item, 11) && !hasMaxQuality(item)) {
				increaseQualityByOne(item);
			}

			if (sellInLessThan(item, 6) && !hasMaxQuality(item)) {
				increaseQualityByOne(item);
			}
		}
		decreaseSellInByOne(item);
		setMinQualityIfSellInLowerThanZero(item);
	}

	private boolean sellInLessThan(Item item, int than) {
		return item.sellIn < than;
	}

	private void setMinQualityIfSellInLowerThanZero(Item item) {
		if (item.sellIn < 0) {
			item.quality = 0;
		}
	}

	private boolean hasMaxQuality(Item item) {
		return item.quality >= 50;
	}

	private int increaseQualityByOne(Item item) {
		return item.quality = item.quality + 1;
	}

	private void decreaseSellInByOne(Item item) {
		item.sellIn = item.sellIn - 1;
	}

}
