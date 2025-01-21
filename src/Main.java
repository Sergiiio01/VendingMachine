import Model.Item;
import Model.Machine;
import View.MachineView;

public class Main {
    public static void main(String[] args) {
        Machine vending = new Machine();
        MachineView view = new MachineView();
        Item item = new Item("Drink", 2.00, 5);
        Item item2 = new Item("Potatoes", 1.50, 8);
        vending.addNewItem(item, 2, 2);
        vending.addNewItem(item2, 1, 1);
        view.start(vending);

    }
}