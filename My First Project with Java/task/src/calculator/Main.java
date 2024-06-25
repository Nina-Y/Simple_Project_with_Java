package calculator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Bubblegum: $", 2, 202));
        items.add(new Item("Toffee: $", 0.2f, 118));
        items.add(new Item("Ice cream: $", 5, 2250));
        items.add(new Item("Milk chocolate: $", 4, 1680));
        items.add(new Item("Doughnut: $", 2.5f, 1075));
        items.add(new Item("Pancake: $", 3.2f, 80));

        StoreSales storeSales = new StoreSales(items);
        storeSales.calculateTotalSales();
        storeSales.calculateNetIncome();
    }
}

