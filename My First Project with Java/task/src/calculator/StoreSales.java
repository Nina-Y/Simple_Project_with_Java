package calculator;

import java.util.List;
import java.util.Scanner;

public class StoreSales {
    private final List<Item> items;
    private float totalSales;

    public StoreSales(List<Item> items) {
        this.items = items;
    }

    public void calculateTotalSales() {
        System.out.println("Earned amount:");
        for (Item item : items) {
            System.out.println(item.getName() + item.getItemSales());
            totalSales += item.getItemSales();
        }
        System.out.println();
        System.out.println("Income: $" + totalSales);
    }

    public float calculateExpenses() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Staff expenses:");
        float staffExp = sc.nextFloat();
        System.out.println("Other expenses:");
        float otherExp = sc.nextFloat();
        sc.close();
        return staffExp + otherExp;
    }

    public void calculateNetIncome() {
        float netIncome = totalSales - calculateExpenses();
        System.out.println("Net income: $" + netIncome);
    }
}
