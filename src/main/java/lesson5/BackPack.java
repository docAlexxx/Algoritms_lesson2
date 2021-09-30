package lesson5;

public class BackPack {
    int maxMass;
    private Item[] items;

    BackPack(Item[] items, int maxMass) {
        this.items = items;
        this.maxMass = maxMass;
    }

    int itemsChoose(int i, int maxMass) {
        if (i < 1) {
            return 0;
        }
        if (items[i].mass > maxMass) {
            return itemsChoose(i - 1, maxMass);
        } else {
            return Math.max(itemsChoose(i - 1, maxMass), itemsChoose(i - 1, maxMass - items[i].mass) + items[i].value);
        }
    }
}
