package calculator;

public class Item {
    private final String name;
    private final float price;
    private final float itemSales;

    public Item(String name, float price, float itemSales) {
        this.name = name;
        this.price = price;
        this.itemSales = itemSales;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getItemSales() {
        return itemSales;
    }
}
