import Model.Item;
import Model.Machine;

public class Main {
    public static void main(String[] args) {
        Machine vending = new Machine();
        Item item = new Item("Drink", 2.00, 5);
        System.out.println("empty machine: ");
        System.out.println(vending.showBalance());
        System.out.print(vending.showMachine());
        vending.addNewItem(item, 2, 2);
        System.out.println(vending.showBalance());
        System.out.print(vending.showMachine());
        vending.addBalance(15);
        System.out.println(vending.showBalance());
        vending.buyItem(2, 2);
        System.out.println("Item sold");
        System.out.print(vending.showMachine());
        System.out.println(vending.showBalance());
    }
}